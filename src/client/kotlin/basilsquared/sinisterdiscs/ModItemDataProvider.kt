package basilsquared.sinisterdiscs

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.minecraft.client.data.models.BlockModelGenerators
import net.minecraft.client.data.models.ItemModelGenerators
import net.minecraft.client.data.models.model.ModelTemplates

class ModItemDataProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(blockStateModelGenerator: BlockModelGenerators) {
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerators) {
        itemModelGenerator.generateFlatItem(ModItems.WELCOME_HOME_DISC_ITEM, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(ModItems.I_MISS_THE_QUIET_DISC_ITEM, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(ModItems.YOU_MUST_ANSWER_DISC_ITEM, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(ModItems.MINDS_DISC_ITEM, ModelTemplates.FLAT_ITEM)
    }

    override fun getName(): String {
        return "ExampleModModelProvider"
    }
}