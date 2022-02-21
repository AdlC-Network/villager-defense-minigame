package me.theguyhere.villagerdefense.plugin.game.models;

import me.theguyhere.villagerdefense.common.CommunicationManager;
import me.theguyhere.villagerdefense.plugin.tools.ItemManager;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class EnchantingBook extends ItemStack {
    private final Enchantment enchantToAdd;

    public EnchantingBook(ItemStack itemStack, Enchantment enchantToAdd) {
        super(itemStack);
        this.enchantToAdd = enchantToAdd;
    }

    public Enchantment getEnchantToAdd() {
        return enchantToAdd;
    }

    public static EnchantingBook check(ItemStack itemStack) {
        if (itemStack == null || itemStack.getType() != Material.ENCHANTED_BOOK)
            return null;

        String enchant;

        // Gather enchant from name
        try {
            enchant = Objects.requireNonNull(itemStack.getItemMeta()).getDisplayName().split(" ")[2];
        } catch (Exception e) {
            return null;
        }

        // Assign to known enchanting books
        switch (enchant) {
            case "Knockback": return new EnchantingBook(knockback(), Enchantment.KNOCKBACK);
            case "Sweeping": return new EnchantingBook(sweepingEdge(), Enchantment.SWEEPING_EDGE);
            case "Smite": return new EnchantingBook(smite(), Enchantment.DAMAGE_UNDEAD);
            case "Sharpness": return new EnchantingBook(sharpness(), Enchantment.DAMAGE_ALL);
            case "Fire": return new EnchantingBook(fireAspect(), Enchantment.FIRE_ASPECT);
            case "Punch": return new EnchantingBook(punch(), Enchantment.ARROW_KNOCKBACK);
            case "Piercing": return new EnchantingBook(piercing(), Enchantment.PIERCING);
            case "Quick": return new EnchantingBook(quickCharge(), Enchantment.QUICK_CHARGE);
            case "Power": return new EnchantingBook(power(), Enchantment.ARROW_DAMAGE);
            case "Loyalty": return new EnchantingBook(loyalty(), Enchantment.LOYALTY);
            case "Flame": return new EnchantingBook(flame(), Enchantment.ARROW_FIRE);
            case "Multishot": return new EnchantingBook(multishot(), Enchantment.MULTISHOT);
            case "Infinity": return new EnchantingBook(infinity(), Enchantment.ARROW_INFINITE);
            case "Blast": return new EnchantingBook(blastProtection(), Enchantment.PROTECTION_EXPLOSIONS);
            case "Thorns": return new EnchantingBook(thorns(), Enchantment.THORNS);
            case "Projectile": return new EnchantingBook(projectileProtection(), Enchantment.PROTECTION_PROJECTILE);
            case "Protection": return new EnchantingBook(protection(), Enchantment.PROTECTION_ENVIRONMENTAL);
            case "Unbreaking": return new EnchantingBook(unbreaking(), Enchantment.DURABILITY);
            case "Mending": return new EnchantingBook(mending(), Enchantment.MENDING);
            default: return null;
        }
    }

    public static ItemStack knockback() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Knockback"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack sweepingEdge() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Sweeping Edge"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack smite() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Smite"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack sharpness() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Sharpness"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack fireAspect() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Fire Aspect"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack punch() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Punch"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack piercing() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Piercing"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack quickCharge() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Quick Charge"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack power() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Power"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack loyalty() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Loyalty"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack flame() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Flame"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&5CAUTION: CAN'T INCREASE LEVEL"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack multishot() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Multishot"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&5CAUTION: CAN'T INCREASE LEVEL"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack infinity() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Infinity"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&5CAUTION: CAN'T INCREASE LEVEL"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack blastProtection() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Blast Protection"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack thorns() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Thorns"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack projectileProtection() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Projectile Protection"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack protection() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Protection"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack unbreaking() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Unbreaking"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
    public static ItemStack mending() {
        return ItemManager.createItem(Material.ENCHANTED_BOOK, CommunicationManager.format("&a&lBook of Mending"),
                ItemManager.BUTTON_FLAGS, ItemManager.glow(), CommunicationManager.format("&7Drop onto another item to enchant"),
                CommunicationManager.format("&5CAUTION: CAN'T INCREASE LEVEL"),
                CommunicationManager.format("&4WARNING: WORKS ON ANY ITEM"));
    }
}
