package com.iceberry.boson.melee_weapons;

import com.iceberry.boson.firstItem.ItemRegistry;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ModItemTier implements IItemTier {

    OBSIDIAN(3, 2000, 10.0F, 4.0F, 30);

    private final int level;
    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int enchantmentValue;

    ModItemTier(int levelLn, int usesIn, float speedLn, float attackDamageBonusIn, int enchantmentValueIn) {
        this.level = levelLn;
        this.uses = usesIn;
        this.speed = speedLn;
        this.attackDamageBonus = attackDamageBonusIn;
        this.enchantmentValue = enchantmentValueIn;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(ItemRegistry.obsidianIngot.get());
    }
}
