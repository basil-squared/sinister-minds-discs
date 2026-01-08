package basilsquared.sinisterdiscs

import net.fabricmc.api.ModInitializer
import net.minecraft.core.registries.BuiltInRegistries
import org.slf4j.LoggerFactory

object SinisterDiscs : ModInitializer {
    private val logger = LoggerFactory.getLogger("sinister-discs")

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")
		ModItems.register()
		ModSounds.register()
		ModCreativeTabs.register()
		println("DEBUG CHECK: The ID is " + BuiltInRegistries.ITEM.getKey(ModItems.WELCOME_HOME_DISC_ITEM))
		// --- PASTE THIS DEBUG BLOCK ---
		println("==================================================")
		println(">>> INSPECTING REGISTRY FOR 'sinister-discs' <<<")

		var found = false
		net.minecraft.core.registries.BuiltInRegistries.ITEM.keySet().forEach { id ->
			// Check for ANY item in your namespace
			if (id.namespace == "sinister-discs" || id.namespace.contains("sinister")) {
				println("FOUND REGISTERED ITEM: $id")
				found = true
			}
		}

		if (!found) println("!!! CRITICAL: NO ITEMS FOUND IN NAMESPACE 'sinister-discs' !!!")
		println("==================================================")
		val path = "/assets/sinister-discs/models/item/welcome_home.json"
		val url = SinisterDiscs::class.java.getResource(path)

		println(">>> FILE PATH CHECK: $path")
		println(">>> DOES JAVA SEE IT?: " + (if (url != null) "YES! Found at: $url" else "NO! It is NULL."))
	}
}
