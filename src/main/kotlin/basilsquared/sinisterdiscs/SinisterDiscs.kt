package basilsquared.sinisterdiscs

import net.fabricmc.api.ModInitializer

import org.slf4j.LoggerFactory

object SinisterDiscs : ModInitializer {
    private val logger = LoggerFactory.getLogger("sinister-discs")
	const val MOD_ID = "sinister-discs"
	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")
		ModItems.register()
		ModSounds.register()
		ModCreativeTabs.register() // Remember that minecraft will freak tf out if you register creative tabs first
		ModLootTableModifiers.register()
	}
}
