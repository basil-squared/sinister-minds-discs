package basilsquared.sinisterdiscs

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import java.util.concurrent.CompletableFuture

class CreeperDiscPoolProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>): FabricTagProvider.ItemTagProvider(output,registriesFuture) {
    override fun addTags(wrapperLookup: HolderLookup.Provider ) {
        fun addToVal(value: TagKey<Item>, addedkey: Item) {
            valueLookupBuilder(value)
                .add(addedkey)
                .setReplace(true)
        }
        val creeperDropKey: TagKey<Item> = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("minecraft","creeper_drop_music_discs"))
        addToVal(creeperDropKey,ModItems.WELCOME_HOME_DISC_ITEM)
        addToVal(creeperDropKey, ModItems.I_MISS_THE_QUIET_DISC_ITEM)
        addToVal(creeperDropKey, ModItems.YOU_MUST_ANSWER_DISC_ITEM)
        addToVal(creeperDropKey, ModItems.MINDS_DISC_ITEM)


    }
}