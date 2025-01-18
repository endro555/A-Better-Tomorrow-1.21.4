package net.endro.better_tomorrow.item;

import net.endro.better_tomorrow.BetterTomorrow;
import net.endro.better_tomorrow.item.custom.ScalpelItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterTomorrow.MOD_ID);

    public static final DeferredItem<Item> ENRICHIUM = ITEMS.register("enrichium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<ScalpelItem> ENRICHIUM_SCALPEL = ITEMS.register("enrichium_scalpel",
            () -> new ScalpelItem(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
