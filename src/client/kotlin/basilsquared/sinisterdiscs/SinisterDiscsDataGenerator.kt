package basilsquared.sinisterdiscs

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

object SinisterDiscsDataGenerator: DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(dataGen: FabricDataGenerator) {
        val pack: FabricDataGenerator.Pack = dataGen.createPack()
        pack.addProvider(::ModItemDataProvider)
        pack.addProvider(::CreeperDiscPoolProvider)
        pack.addProvider(::TranslationProvider)
        pack.addProvider( ::ModSoundsProvider)
    }
}
