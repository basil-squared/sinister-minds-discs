package basilsquared.sinisterdiscs

import com.google.gson.GsonBuilder
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.minecraft.data.CachedOutput
import net.minecraft.data.DataProvider

import net.minecraft.data.PackOutput
import java.util.concurrent.CompletableFuture

class ModSoundsProvider(
    private val dataOutput: FabricDataOutput
) : DataProvider {

    // readable json
    private val gson = GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create()

    override fun run(output: CachedOutput): CompletableFuture<*> {
        val soundsData = mutableMapOf<String, Any>()

        // iterating over constant list
        ModUtils.SONG_IDS.forEach { songName ->


            val id = ModUtils.createIdentifier(songName)

            val entry = mapOf(
                "category" to "record", // put music discs in record cat
                "subtitle" to "subtitles.item.${id.namespace}.$songName", // caption key
                "sounds" to listOf(
                    mapOf(

                        "name" to "${id.namespace}:records/${id.path}",


                        "stream" to true
                    )
                )
            )


            soundsData[songName] = entry
        }


        val path = dataOutput.getOutputFolder(PackOutput.Target.RESOURCE_PACK).resolve("${SinisterDiscs.MOD_ID}/sounds.json")


        return DataProvider.saveStable(output, gson.toJsonTree(soundsData), path)
    }

    override fun getName(): String = "Mod Sounds.json Provider"
}