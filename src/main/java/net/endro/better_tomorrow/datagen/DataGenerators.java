package net.endro.better_tomorrow.datagen;


import net.endro.better_tomorrow.BetterTomorrow;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = BetterTomorrow.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
@SubscribeEvent
        public static void gatherData(GatherDataEvent event){
    DataGenerator generator = event.getGenerator();
    PackOutput packOutput = generator.getPackOutput();
        }

}
