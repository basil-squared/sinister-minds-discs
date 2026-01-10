package basilsquared.sinisterdiscs

import basilsquared.sinisterdiscs.ModUtils.SONG_IDS
import basilsquared.sinisterdiscs.ModUtils.createIdentifier
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.Identifier
import net.minecraft.sounds.SoundEvent

object ModSounds {
    private val SOUNDS_TO_REGISTER = mutableMapOf<Identifier, SoundEvent>()
    private fun registerSound(name: String): SoundEvent {
        val id = createIdentifier(name)
        val event = SoundEvent.createVariableRangeEvent(id)
        SOUNDS_TO_REGISTER[id] = event
        return event
    }

   // quick lambda just to register everything
    val sounds = { ->
        for (id in SONG_IDS) {
            registerSound(id)
        }
    }




    fun register() {
        SOUNDS_TO_REGISTER.forEach { (id, event) ->
            Registry.register(BuiltInRegistries.SOUND_EVENT, id, event)
        }
    }
}