package basilsquared.sinisterdiscs

import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.JukeboxSong

object SinisterJukeboxSongs {
    val WELCOME_HOME: ResourceKey<JukeboxSong> = ResourceKey.create(
        Registries.JUKEBOX_SONG,
        Identifier.fromNamespaceAndPath("sinister-discs", "welcome_home")
    )



}