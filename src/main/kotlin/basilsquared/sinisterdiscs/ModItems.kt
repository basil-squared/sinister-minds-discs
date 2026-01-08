package basilsquared.sinisterdiscs

import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item
import net.minecraft.world.item.JukeboxSong

object ModItems {

    // 1. Create the ITEM KEY first (Defines the name)
    val WELCOME_HOME_KEY: ResourceKey<Item> = ResourceKey.create(
        Registries.ITEM,
        Identifier.fromNamespaceAndPath("sinister-discs", "welcome_home")
    )

    // 2. Create the SONG KEY (for the jukebox logic)
    val WELCOME_HOME_SONG_KEY: ResourceKey<JukeboxSong> = ResourceKey.create(
        Registries.JUKEBOX_SONG,
        Identifier.fromNamespaceAndPath("sinister-discs", "welcome_home")
    )

    // 3. Create the Item, PASSING THE KEY into Properties
    val WELCOME_HOME_DISC_ITEM: Item = register(
        WELCOME_HOME_KEY,
        Item(
            Item.Properties()
                .setId(WELCOME_HOME_KEY) // <--- THIS IS THE FIX. It stops the crash.
                .jukeboxPlayable(WELCOME_HOME_SONG_KEY)
        )
    )

    // Helper function that takes the pre-made Key
    private fun register(key: ResourceKey<Item>, item: Item): Item {
        return Registry.register(BuiltInRegistries.ITEM, key, item)
    }

    fun register() {}
}