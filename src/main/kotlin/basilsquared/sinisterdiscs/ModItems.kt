package basilsquared.sinisterdiscs

import basilsquared.sinisterdiscs.SinisterDiscs

// Mojang: JukeboxSong is in world.item
import net.minecraft.world.item.JukeboxSong
import net.minecraft.world.item.
import net.minecraft.world.item.RecordItem // Mojang calls MusicDiscItem "RecordItem"

// Mojang: Registry stuff is in core.registries or resources
import net.minecraft.resources.ResourceKey
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Rarity

public object SinisterModItems {
   val WELCOME_HOME: ResourceKey<JukeboxSong> = ResourceKey.create(
      Registries.JUKEBOX_SONG,
      ResourceLocation.fromNamespaceAndPath("sinister-discs", "welcome_home")
   )


   val WELCOME_HOME_DISC = RecordItem(WELCOME_HOME, Item.Properties().stacksTo(1).rarity(Rarity.RARE))
}