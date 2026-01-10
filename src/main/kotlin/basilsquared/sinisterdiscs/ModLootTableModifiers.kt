package basilsquared.sinisterdiscs

import basilsquared.sinisterdiscs.ModUtils.SONG_IDS
import net.fabricmc.fabric.api.loot.v3.LootTableEvents

import net.minecraft.resources.Identifier
import net.minecraft.world.level.ItemLike
import net.minecraft.world.level.storage.loot.LootPool
import net.minecraft.world.level.storage.loot.entries.LootItem
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator


// Quick function to do something I was repeating anyway
fun addToPool(pool: LootPool.Builder,item: ItemLike, weight: Int) {
    pool.add(
        LootItem.lootTableItem(item)
            .setWeight(weight)


    )
}
object ModLootTableModifiers {
    private val NETHER_BRIDGE_CHEST_ID = Identifier.fromNamespaceAndPath("minecraft","chest/nether_bridge")

    fun register() {
        // Lambdas! Hoorah! Don't quite understand these but im gonna try to learn
        // OOO, so they're like uhh. anonymous quick one-off functions! fun :)
        LootTableEvents.MODIFY.register {key, tableBuilder, source, _ ->
                if (source.isBuiltin && NETHER_BRIDGE_CHEST_ID == key) {
                    // this is the actual pool to make
                    val poolBuilder: LootPool.Builder = LootPool.lootPool()
                        .setRolls(UniformGenerator.between(0F,1F))
                    // I LOVE COOL FUNCTIONS RAAGGGGGHHHHHHHH
                    for (item in SONG_IDS) {
                        addToPool(poolBuilder, ModItems.ITEMS_INDEX[item]!!, 5)
                    }
                    tableBuilder.withPool(poolBuilder)

                }

            }
    }
}