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

public class bookItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Tarpo.MOD_ID);

    public static class divinityBook extends Item {
        public divinityBook(Properties properties) {
                super(properties);
            }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
            tooltip.add(new TranslationTextComponent("tooltip.books.divinity-book"));
            super.appendHoverText(stack, worldIn, tooltip, flagIn);
        }  
    } 
    public static class manaBook extends Item {
        public manaBook(Properties properties) {
                super(properties);
            }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
            tooltip.add(new TranslationTextComponent("tooltip.books.mana-book"));
            super.appendHoverText(stack, worldIn, tooltip, flagIn);
        }  
    } 
    public static class pranaBook extends Item {
        public pranaBook(Properties properties) {
                super(properties);
            }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
            tooltip.add(new TranslationTextComponent("tooltip.books.prana-book"));
            super.appendHoverText(stack, worldIn, tooltip, flagIn);
        }  
    } 
    public static class chiBook extends Item {
        public chiBook(Properties properties) {
                super(properties);
            }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
            tooltip.add(new TranslationTextComponent("tooltip.books.chi-book"));
            super.appendHoverText(stack, worldIn, tooltip, flagIn);
        }  
    } 
    public static class startBook extends Item {
        public startBook(Properties properties) {
                super(properties);
            }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
            tooltip.add(new TranslationTextComponent("tooltip.books.start-book"));
            super.appendHoverText(stack, worldIn, tooltip, flagIn);
        }  
    } 
}