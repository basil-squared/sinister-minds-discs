package basilsquared.sinisterdiscs


import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries

import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item
import net.minecraft.world.item.Rarity

object ModItems {


    val WELCOME_HOME_DISC_ITEM: Item = register(
        ModIds.WELCOME_HOME_ITEM_ID,
        Item(
            Item.Properties()
                .setId(ModIds.WELCOME_HOME_ITEM_ID)
                .jukeboxPlayable(SinisterJukeboxSongs.WELCOME_HOME)
                .stacksTo(1)
                .rarity(Rarity.RARE)
        )
    )
    val I_MISS_THE_QUIET_DISC_ITEM: Item = register(
        key = ModIds.I_MISS_THE_QUIET_ITEM_ID,
        Item(
            Item.Properties()
                .setId(ModIds.I_MISS_THE_QUIET_ITEM_ID)
                .jukeboxPlayable(SinisterJukeboxSongs.I_MISS_THE_QUIET)
                .stacksTo(1)
                .rarity(Rarity.RARE)
        )
    )
    val YOU_MUST_ANSWER_DISC_ITEM: Item = register(
        key = ModIds.YOU_MUST_ANSWER_ITEM_ID,
        Item(
            Item.Properties()
                .setId(ModIds.YOU_MUST_ANSWER_ITEM_ID)
                .jukeboxPlayable(SinisterJukeboxSongs.YOU_MUST_ANSWER)
                .stacksTo(1)
                .rarity(Rarity.RARE)
        )
    )
    val MINDS_DISC_ITEM: Item = register(
        key = ModIds.MINDS_ITEM_ID,
        Item(
            Item.Properties()
                .setId(ModIds.MINDS_ITEM_ID)
                .jukeboxPlayable(SinisterJukeboxSongs.MINDS)
                .stacksTo(1)
                .rarity(Rarity.RARE)
        )
    )
    private fun register(key: ResourceKey<Item>, item: Item): Item {
        return Registry.register(BuiltInRegistries.ITEM, key, item)
    }

    fun register() {}
}