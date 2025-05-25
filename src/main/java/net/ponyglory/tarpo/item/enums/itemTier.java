package net.ponyglory.tarpo.item.enums;

import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.ponyglory.tarpo.item.RegistryItem;

public enum itemTier implements IItemTier {
    STEEL(4, 750, 4f, 6f, 16, // Hurvest, Uses, Eff, DamageBase
        () -> Ingredient.of(RegistryItem.STEEL.get()));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    itemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, 
        Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getUses() {
        return maxUses;
    };

    @Override
    public float getSpeed(){
        return efficiency;
    };

    @Override
    public float getAttackDamageBonus(){
        return attackDamage;
    };

    @Override
    public int getLevel() {
        return harvestLevel;
    };

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    };

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    };
}
