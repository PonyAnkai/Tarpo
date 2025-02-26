package net.ponyglory.tarpo.item;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.ponyglory.tarpo.Tarpo;

public class fightItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Tarpo.MOD_ID);

    public static class divinityWandTier1 extends Item {
        public divinityWandTier1(Properties properties) {
                super(properties);
            }

        @Override
        public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
            tooltip.add(new TranslationTextComponent("tooltip.books.divinity-wand-tier1-1"));
            super.appendHoverText(stack, worldIn, tooltip, flagIn);
        }  

        
    }
}
