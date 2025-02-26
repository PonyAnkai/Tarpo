package net.ponyglory.tarpo.itemgroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.ponyglory.tarpo.item.RegistryItem;

public class baseGroup {

    public static final ItemGroup DIVINITY_GROUP = new ItemGroup("dinity-group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryItem.DIVINITY_EDIT.get());
        }
    };
    public static final ItemGroup MANA_GROUP = new ItemGroup("mana-group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryItem.MANA_EDTI.get());
        }
    };
    public static final ItemGroup PRANA_GROUP = new ItemGroup("prana-group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryItem.PRANA_EDIT.get());
        }
    };
    public static final ItemGroup CHI_GROUP = new ItemGroup("chi-group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryItem.CHI_EDIT.get());
        }
    };
    public static final ItemGroup START_GROUP = new ItemGroup("start-group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryItem.START_EDIT.get());
        }
    };
    public static final ItemGroup CREATIVE_GROUP = new ItemGroup("creative-group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryItem.CREATIVE_EDIT.get());
        }
    };
}
