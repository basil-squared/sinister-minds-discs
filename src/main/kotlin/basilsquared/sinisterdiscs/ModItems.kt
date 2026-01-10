package basilsquared.sinisterdiscs


import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries

import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item
import net.minecraft.world.item.Rarity
import basilsquared.sinisterdiscs.ModUtils.SONG_IDS
object ModItems {
    val ITEMS_INDEX: Map<String, Item> = run { ->
        val tempMap: MutableMap<String, Item> = mutableMapOf()
        for (item in SONG_IDS) {
            tempMap[item] = register(
                ModIds.ITEM_IDS[item]!!,
                Item(
                    Item.Properties()
                        .setId(ModIds.ITEM_IDS[item]!!)
                        .jukeboxPlayable(SinisterJukeboxSongs.SINISTER_SONGS[item]!!)
                        .stacksTo(1)
                        .rarity(Rarity.RARE)
                )
            )
        }
        tempMap.toMap()
    }

    private fun register(key: ResourceKey<Item>, item: Item): Item {
        return Registry.register(BuiltInRegistries.ITEM, key, item)
    }

    fun register() {}
}