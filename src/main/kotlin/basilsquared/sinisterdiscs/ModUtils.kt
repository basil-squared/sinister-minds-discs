package basilsquared.sinisterdiscs

import net.minecraft.resources.Identifier

object ModUtils {
    val SONG_IDS: List<String> = listOf(
        "welcome_home",
        "i_miss_the_quiet",
        "you_must_answer",
        "minds",
        "big_misser",
        "i_did_that",
        "meatshow",
        "beauty",
        "scars",
        "the_fire_rises",
        "sinister",
        "feel_that_dread",
        "runaway",
        "red_handed",
        "one_last_ask",
        "dont_come_back"
    )
    /**
     * Given a name, register an identifier associated with that name
     * @param name The name of the to-be-registered identifier
     */

    fun createIdentifier(name: String): Identifier {
        return Identifier.fromNamespaceAndPath(SinisterDiscs.MOD_ID,name)
    }

    /**
     * Given a List of Strings, register identifiers using the names of all of those strings
     * @param identifiers The list of to-be-registered names
     */
    fun createAllIdentifiers(identifiers: List<String>): Map<String,Identifier> {
        val tempMap: MutableMap<String,Identifier> = mutableMapOf()
        for (item in identifiers) {

            tempMap[item] = createIdentifier(item)
        }
        // convert it back to a regular map before returning
        return tempMap.toMap()
    }
}