package net.lamecinnamon.epistemikamod.item;

import net.lamecinnamon.epistemikamod.EpistemikaMod;
import net.lamecinnamon.epistemikamod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.SharedLibrary;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EpistemikaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EPISTEMIKA_TAB = CREATIVE_MODE_TABS.register("epistemika_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SENONITE.get()))
                    .title(Component.translatable("creativetab:epistemika_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SENONITE.get());

                        pOutput.accept(ModBlocks.SENONITE_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
