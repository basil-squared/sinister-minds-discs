package basilsquared.sinisterdiscs

import basilsquared.sinisterdiscs.ModUtils.SONG_IDS
import basilsquared.sinisterdiscs.ModUtils.createAllIdentifiers
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item

object ModIds {

    val item_id_identifiers: Map<String,Identifier> = createAllIdentifiers(SONG_IDS)
    val WELCOME_HOME_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["welcome_home"]!!
    )


    val I_MISS_THE_QUIET_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["i_miss_the_quiet"]!!
    )
    val YOU_MUST_ANSWER_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
       item_id_identifiers["you_must_answer"]!!
    )
    val MINDS_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["minds"]!!
    )
    val BIG_MISSER_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["big_misser"]!!
    )
    val I_DID_THAT_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["i_did_that"]!!

    )
    val MEATSHOW_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["meatshow"]!!
    )
    val BEAUTY_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["beauty"]!!
    )
    val SCARS_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["scars"]!!
    )
    val THE_FIRE_RISES_ITEM_ID: ResourceKey<Item>  = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["the_fire_rises"]!!
    )
    val SINISTER_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["sinister"]!!
    )
    val FEEL_THAT_DREAD_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["feel_that_dread"]!!
    )
    val RUNAWAY_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["runaway"]!!
    )
    val RED_HANDED_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["red_handed"]!!
    )
    val ONE_LAST_ASK_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["one_last_ask"]!!
    )
    val DONT_COME_BACK_ITEM_ID: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        item_id_identifiers["dont_come_back"]!!
    )
}