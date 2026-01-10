package basilsquared.sinisterdiscs

import basilsquared.sinisterdiscs.ModUtils.SONG_IDS
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.minecraft.client.data.models.BlockModelGenerators
import net.minecraft.client.data.models.ItemModelGenerators
import net.minecraft.client.data.models.model.ModelTemplates


class ModItemDataProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(blockStateModelGenerator: BlockModelGenerators) {
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerators) {
        for (item in SONG_IDS) {
            itemModelGenerator.generateFlatItem(ModItems.ITEMS_INDEX[item]!!, ModelTemplates.FLAT_ITEM)
        }
    }

    override fun getName(): String {
        return "ExampleModModelProvider"
    }
}