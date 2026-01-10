package basilsquared.sinisterdiscs


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider
import net.minecraft.client.sounds.JOrbisAudioStream
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.resources.Identifier
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.JukeboxSong
import java.io.File
import java.io.FileInputStream

import java.util.concurrent.CompletableFuture
import kotlin.math.ceil

class ModJukeboxSongProvider(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<HolderLookup.Provider>
) : FabricDynamicRegistryProvider(output, registriesFuture) {

    override fun configure(registries: HolderLookup.Provider, entries: Entries) {
        val projectRoot = File(System.getProperty("user.dir"))

        ModUtils.SONG_IDS.forEach { songName ->
            val id = Identifier.fromNamespaceAndPath("sinister-discs", songName)
            val songKey = ResourceKey.create(Registries.JUKEBOX_SONG, id)
            val soundKey = ResourceKey.create(Registries.SOUND_EVENT, id)

            // nab the file
            val soundFile = OggHelper.findSoundFile(projectRoot, "sinister-discs", songName)

            // grab duration, wanna do it the clean way first then have the dirty way if that doesnt work, if clean way works in datagen then im just wiping the messy way
            val duration = try {
                getDurationMinecraftWay(soundFile)

            } catch (_: Throwable) {
                // if LWJGL fails to load or class is missing, fallback to manual parsing
                println("Minecraft audio engine unavailable for DataGen. Falling back to manual parser for $songName.")
                OggHelper.getOggDuration(soundFile)
            }

            // register the thing
            val soundHolder = BuiltInRegistries.SOUND_EVENT.get(soundKey)
                .orElseThrow { IllegalStateException("Sound Event $id not registered!") }

            val songData = JukeboxSong(
                soundHolder,
                Component.translatable("item.sinister-discs.$songName.desc"),
                duration,
                1
            )

            entries.add(songKey, songData)
        }
    }

    override fun getName(): String = "Jukebox Song Definitions"

    // the minecraft way
    private fun getDurationMinecraftWay(file: File): Float {
        FileInputStream(file).use { input ->
            // lets try to laod natives here
            JOrbisAudioStream(input).use { stream ->

                // decode the whole shitting thing. we have enough ram, i promise you

                val audioData = stream.readAll()
                val format = stream.format

                // duration = bytes / frame size / samples
                // frame Size is usually channels * 2
                val totalBytes = audioData.capacity()
                val frameSize = format.frameSize
                val sampleRate = format.sampleRate

                return ceil(totalBytes.toDouble() / frameSize.toDouble() / sampleRate.toDouble()).toFloat()
            }
        }
    }
}