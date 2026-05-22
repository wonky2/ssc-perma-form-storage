package wonky.sscpermaformstorage.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import wonky.sscpermaformstorage.SSCPermaFormStorage;

public class ModItems {
    public static final Item GILDED_ECHO_SHARD = registerItem("gilded_echo_shard", new Item(new FabricItemSettings().food(ModFoodComponents.GILDED_ECHO_SHARD)));
    public static final Item EMPTY_GILDED_ECHO_SHARD = registerItem("empty_gilded_echo_shard", new Item(new FabricItemSettings().food(ModFoodComponents.EMPTY_GILDED_ECHO_SHARD)));
    public static final Item CRACKED_GILDED_ECHO_SHARD = registerItem("cracked_gilded_echo_shard", new Item(new FabricItemSettings()));

    private static void addFoodItems(FabricItemGroupEntries entries) {
        entries.add(GILDED_ECHO_SHARD);
        entries.add(EMPTY_GILDED_ECHO_SHARD);
    }

    private static void addIngredientItems(FabricItemGroupEntries entries) {
        entries.add(CRACKED_GILDED_ECHO_SHARD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SSCPermaFormStorage.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SSCPermaFormStorage.LOGGER.info("Registering " + SSCPermaFormStorage.MOD_ID + "items.");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addFoodItems);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addIngredientItems);
    }
}
