package botcyrox.test.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class BotCyroxTestMod implements ModInitializer {

	public static final Item TEST_THING = new Item(new Item.Settings().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON).maxDamage(10));
	

	@Override
	public void onInitialize() {
		
		Registry.register(Registry.ITEM, new Identifier("botcyrox", "test_thing"), TEST_THING);
	}
}
