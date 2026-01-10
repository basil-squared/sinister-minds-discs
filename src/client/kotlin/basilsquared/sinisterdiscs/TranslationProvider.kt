package basilsquared.sinisterdiscs

import basilsquared.sinisterdiscs.ModUtils.SONG_IDS
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.core.HolderLookup
import java.util.concurrent.CompletableFuture


class TranslationProvider(dataOutput: FabricDataOutput,
                          registryLookup: CompletableFuture<HolderLookup.Provider>): FabricLanguageProvider(dataOutput,registryLookup) {
    override fun generateTranslations(wrapperLookup: HolderLookup.Provider, translationBuilder: TranslationBuilder) {
        val descMap: Map<String, String> = mapOf(
            "welcome_home" to "Lord X - Welcome Home",
            "i_miss_the_quiet" to "Lord X - I Miss The Quiet",
            "you_must_answer" to "Lord X - You Must Answer",
            "minds" to "Lord X ft. Majin - Minds",
            "big_misser" to "Lord X - Big Misser",
            "i_did_that" to "Lord X ft. Bendo - I Did That",
            "meatshow" to "Lord X ft. Redglove - Meatshow",
            "beauty" to "Lord X ft. Miss Halloween - Beauty",
            "scars" to "Lord X - Scars",
            "the_fire_rises" to "Lord X - The Fire Rises",
            "sinister" to "Majin ft. Boundless A. Games - Sinister",
            "feel_that_dread" to "Lord X ft. Español - Feel That Dread?",
            "runaway" to "2011X - RUNAWAY",
            "red_handed" to "Lord X ft. Redglove, Deutsch - Red-Handed",
            "one_last_ask" to "Lord X - One Last Ask",
            "dont_come_back" to "Lord X - Don't Come Back."
        )
        for (item in SONG_IDS) {
            translationBuilder.add("item.sinister-discs.$item", "Music Disc")
            translationBuilder.add("item.sinister-discs.$item.desc",descMap[item]!!)
        }
        translationBuilder.add("itemGroup.sinister-discs.general","Sinister Discs")


    }
}