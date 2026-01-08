package basilsquared.sinisterdiscs

import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item

object ModIds {
    val WELCOME_HOME_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        Identifier.fromNamespaceAndPath("sinister-discs","welcome_home"))
    val I_MISS_THE_QUIET_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        Identifier.fromNamespaceAndPath("sinister-discs","i_miss_the_quiet")
    )
    val YOU_MUST_ANSWER_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        Identifier.fromNamespaceAndPath("sinister-discs", "you_must_answer")
    )
}