package basilsquared.sinisterdiscs

import net.minecraft.world.item.Item
import net.minecraft.core.registries.BuiltInRegistries

import net.minecraft.resources.Identifier
import net.minecraft.core.Registry

public class Utils {
    companion object {
        fun registerItem(name: String, item: Item):Item {

            return Registry.register(BuiltInRegistries.ITEM,Identifier.fromNamespaceAndPath("sinister-discs", name), item)

        }
    }
}
