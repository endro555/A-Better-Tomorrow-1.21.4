package net.endro.better_tomorrow.item;

import net.endro.better_tomorrow.BetterTomorrow;
import net.endro.better_tomorrow.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterTomorrow.MOD_ID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TAB.register("bismuth_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENRICHIUM.get()))
                    .title(Component.translatable("creativetab.bettertomorrow.general"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ENRICHIUM);
                        output.accept(ModBlocks.ENRICHIUM_BLOCK);
                        output.accept(ModBlocks.ENRICHIUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_ENRICHIUM_ORE);
                    }).build());

    public static final Supplier<CreativeModeTab> BISMUTH_BLOCK_TAB = CREATIVE_MODE_TAB.register("bismuth_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ENRICHIUM_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(BetterTomorrow.MOD_ID, "bismuth_items_tab"))
                    .title(Component.translatable("creativetab.bettertomorrow.archaeology"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ENRICHIUM_SCALPEL);
                        output.accept(Blocks.HEAVY_CORE);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}