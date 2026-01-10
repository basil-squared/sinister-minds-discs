package basilsquared.sinisterdiscs

import basilsquared.sinisterdiscs.ModUtils.SONG_IDS

import basilsquared.sinisterdiscs.ModUtils.createIdentifier
import net.minecraft.core.registries.Registries

import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item


object ModIds {


    fun sinisterCreateItemId(name: String): ResourceKey<Item> {
        return ResourceKey.create(
            Registries.ITEM,
            createIdentifier(name)
        )
    }

    val ITEM_IDS: Map<String,ResourceKey<Item>> = run {
        val tempMap: MutableMap<String, ResourceKey<Item>> = mutableMapOf()
        for (item in SONG_IDS) {
            tempMap[item]  = sinisterCreateItemId(item)
        }
        tempMap.toMap()

    }

}