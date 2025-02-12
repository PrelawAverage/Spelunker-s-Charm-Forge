package net.luckystudio.splelunkers_charm.item;

import net.luckystudio.splelunkers_charm.SpelunkersCharm;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpelunkersCharm.MODID);

    public static final Supplier<CreativeModeTab> SPELUNKERS_CHARM = CREATIVE_MODE_TABS.register("spelunkers_charm",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ROCK.get()))
                    .title(Component.translatable("creative_tab.spelunkers_charm"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ROCK);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
