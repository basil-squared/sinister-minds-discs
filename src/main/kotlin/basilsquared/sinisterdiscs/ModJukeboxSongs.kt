package basilsquared.sinisterdiscs

import basilsquared.sinisterdiscs.ModUtils.SONG_IDS
import basilsquared.sinisterdiscs.ModUtils.createIdentifier
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.JukeboxSong


object SinisterJukeboxSongs {
    fun sinisterCreateJukeboxSong(name: String): ResourceKey<JukeboxSong> {
        return ResourceKey.create(
            Registries.JUKEBOX_SONG,
            createIdentifier(name)
        )
    }



    val SINISTER_SONGS: Map<String,ResourceKey<JukeboxSong>> =  run {
        val tempMap: MutableMap<String,ResourceKey<JukeboxSong>> = mutableMapOf()
        for (item in SONG_IDS) {
            tempMap[item] = sinisterCreateJukeboxSong(item)
        }
        tempMap.toMap()
    }







}