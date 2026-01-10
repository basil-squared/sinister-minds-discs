package basilsquared.sinisterdiscs

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.core.HolderLookup
import java.util.concurrent.CompletableFuture


class TranslationProvider(dataOutput: FabricDataOutput,
                          registryLookup: CompletableFuture<HolderLookup.Provider>): FabricLanguageProvider(dataOutput,registryLookup) {
    override fun generateTranslations(wrapperLookup: HolderLookup.Provider, translationBuilder: TranslationBuilder) {
        translationBuilder.add("item.sinister-discs.welcome_home","Music Disc")
        translationBuilder.add("itemGroup.sinister-discs.general","Sinister Discs")
        translationBuilder.add("item.sinister-discs.welcome_home.desc","Lord X - Welcome Home")
        translationBuilder.add("item.sinister-discs.i_miss_the_quiet","Music Disc")
        translationBuilder.add("item.sinister-discs.i_miss_the_quiet.desc","Lord X - I Miss the Quiet")
        translationBuilder.add("item.sinister-discs.you_must_answer","Music Disc")
        translationBuilder.add("item.sinister-discs.you_must_answer.desc","Lord X - You Must Answer")
        translationBuilder.add("item.sinister-discs.minds","Music Disc")
        translationBuilder.add("item.sinister-discs.minds.desc","Lord X ft. Majin - Minds")
    }
}