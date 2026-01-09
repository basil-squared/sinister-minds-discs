package basilsquared.sinisterdiscs

import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.Identifier
import net.minecraft.sounds.SoundEvent

object ModSounds {
    private val SOUNDS_TO_REGISTER = mutableMapOf<Identifier, SoundEvent>()
    private fun registerSound(name: String): SoundEvent {
        val id = Identifier.fromNamespaceAndPath("sinister-discs", name)
        val event = SoundEvent.createVariableRangeEvent(id)
        SOUNDS_TO_REGISTER[id] = event
        return event
    }
    val WELCOME_HOME = registerSound("welcome_home")
    val I_MISS_THE_QUIET = registerSound("i_miss_the_quiet")
    val YOU_MUST_ANSWER = registerSound("you_must_answer")




    fun register() {
        SOUNDS_TO_REGISTER.forEach { (id, event) ->
            Registry.register(BuiltInRegistries.SOUND_EVENT, id, event)
        }
    }
}