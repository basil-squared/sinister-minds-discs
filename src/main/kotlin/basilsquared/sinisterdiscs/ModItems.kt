package basilsquared.sinisterdiscs


import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries

import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item


object ModItems {


    val WELCOME_HOME_DISC_ITEM: Item = register(
        ModIds.WELCOME_HOME_ITEM_ID,
        Item(
            Item.Properties()
                .setId(ModIds.WELCOME_HOME_ITEM_ID)
                .jukeboxPlayable(SinisterJukeboxSongs.WELCOME_HOME)
        )
    )

    // Helper function that takes the pre-made Key
    private fun register(key: ResourceKey<Item>, item: Item): Item {
        return Registry.register(BuiltInRegistries.ITEM, key, item)
    }

    fun register() {}
}