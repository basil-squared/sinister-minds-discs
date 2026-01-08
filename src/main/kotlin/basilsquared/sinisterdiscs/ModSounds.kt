package basilsquared.sinisterdiscs

import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.Identifier
import net.minecraft.sounds.SoundEvent

object ModSounds {
    //  tweak: adjust ID name to be more concise
    val WELCOME_HOME_SOUND_ID: Identifier = Identifier.fromNamespaceAndPath("sinister-discs", "welcome_home")


    val WELCOME_HOME_EVENT: SoundEvent = SoundEvent.createVariableRangeEvent(WELCOME_HOME_SOUND_ID)


    fun register() {
        Registry.register(BuiltInRegistries.SOUND_EVENT, WELCOME_HOME_SOUND_ID, WELCOME_HOME_EVENT)
    }
}