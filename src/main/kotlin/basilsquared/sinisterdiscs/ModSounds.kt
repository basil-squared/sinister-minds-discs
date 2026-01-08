package basilsquared.sinisterdiscs

import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.Identifier
import net.minecraft.sounds.SoundEvent

object ModSounds {
    // 1. Define the ID (Must match the "sound_event" in your jukebox_song JSON)
    val WELCOME_HOME_ID: Identifier = Identifier.fromNamespaceAndPath("sinister-discs", "welcome_home")

    // 2. Create the Event
    val WELCOME_HOME_EVENT: SoundEvent = SoundEvent.createVariableRangeEvent(WELCOME_HOME_ID)

    // 3. Register it
    fun register() {
        Registry.register(BuiltInRegistries.SOUND_EVENT, WELCOME_HOME_ID, WELCOME_HOME_EVENT)
    }
}