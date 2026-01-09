package basilsquared.sinisterdiscs

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.Identifier
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack

object ModCreativeTabs {
    // 1. Create a Key for the tab
    private val SINISTER_TAB_KEY: ResourceKey<CreativeModeTab> = ResourceKey.create(
        Registries.CREATIVE_MODE_TAB,
        Identifier.fromNamespaceAndPath("sinister-discs", "general_tab")
    )


    private val SINISTER_TAB: CreativeModeTab = FabricItemGroup.builder()
        .icon { ItemStack(ModItems.WELCOME_HOME_DISC_ITEM) }
        .title(Component.translatable("itemGroup.sinister-discs.general"))
        .build()

    fun register() {
        Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            SINISTER_TAB_KEY,
            SINISTER_TAB
        )

        ItemGroupEvents.modifyEntriesEvent(SINISTER_TAB_KEY).register { content ->
            // find all items belonging to the mod
            BuiltInRegistries.ITEM.forEach { item ->
                // get the ID
                val id = BuiltInRegistries.ITEM.getKey(item)

                // ignores shit that isnt mine
                if (id.namespace == "sinister-discs") {
                    content.accept(item)
                }
            }
        }
    }
}