package enchantify;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Cmd
        implements CommandExecutor {

    private Enchantify plugin;

    public Cmd(Enchantify instance) {
        this.plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if ((sender instanceof Player)) {
            Player player = (Player) sender;
            if (!player.isOp()) {
                return true;
            }
            if (args.length == 0) {
                try {
                    for (ItemStack i : player.getInventory().getContents()) {
                        if (!(i == null)) {
                            if (i.getEnchantments().isEmpty()) {
                                if (i.getType() == Material.IRON_SWORD || i.getType() == Material.DIAMOND_SWORD || i.getType() == Material.WOOD_SWORD || i.getType() == Material.GOLD_SWORD || i.getType() == Material.STONE_SWORD) {
                                    i.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
                                    i.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 5);
                                    i.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 5);
                                    i.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
                                    i.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
                                    i.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);
                                }
                                if (i.getType() == Material.IRON_PICKAXE || i.getType() == Material.DIAMOND_PICKAXE || i.getType() == Material.WOOD_PICKAXE || i.getType() == Material.GOLD_PICKAXE || i.getType() == Material.STONE_PICKAXE) {
                                    i.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
                                    i.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
                                    i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
                                    i.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
                                }
                                if (i.getType() == Material.IRON_AXE || i.getType() == Material.DIAMOND_AXE || i.getType() == Material.WOOD_AXE || i.getType() == Material.GOLD_AXE || i.getType() == Material.STONE_AXE) {
                                    i.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
                                    i.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
                                    i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
                                    i.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
                                }
                                if (i.getType() == Material.IRON_SPADE || i.getType() == Material.DIAMOND_SPADE || i.getType() == Material.WOOD_SPADE || i.getType() == Material.GOLD_SPADE || i.getType() == Material.STONE_SPADE) {
                                    i.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
                                    i.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
                                    i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
                                    i.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
                                }
                                if (i.getType() == Material.BOW) {
                                    i.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 5);
                                    i.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 1);
                                    i.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
                                    i.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                                }
                            }
                        }
                    }

                    for (ItemStack i : player.getInventory().getArmorContents()) {
                        if (!(i == null)) {
                            if (i.getEnchantments().isEmpty()) {
                                if (i.getType() == Material.GOLD_HELMET || i.getType() == Material.GOLD_BOOTS || i.getType() == Material.DIAMOND_BOOTS || i.getType() == Material.DIAMOND_HELMET || i.getType() == Material.LEATHER_HELMET || i.getType() == Material.LEATHER_BOOTS || i.getType() == Material.IRON_HELMET || i.getType() == Material.IRON_BOOTS || i.getType() == Material.IRON_CHESTPLATE || i.getType() == Material.IRON_LEGGINGS || i.getType() == Material.LEATHER_LEGGINGS || i.getType() == Material.LEATHER_CHESTPLATE || i.getType() == Material.GOLD_CHESTPLATE || i.getType() == Material.GOLD_LEGGINGS || i.getType() == Material.DIAMOND_CHESTPLATE || i.getType() == Material.DIAMOND_LEGGINGS) {
                                    i.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                                    i.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 4);
                                    i.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 4);
                                    i.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 4);
                                }
                                if (i.getType() == Material.IRON_HELMET || i.getType() == Material.DIAMOND_HELMET || i.getType() == Material.GOLD_HELMET || i.getType() == Material.LEATHER_HELMET) {
                                    i.addUnsafeEnchantment(Enchantment.OXYGEN, 3);
                                    i.addUnsafeEnchantment(Enchantment.WATER_WORKER, 1);
                                }
                                if (i.getType() == Material.IRON_BOOTS || i.getType() == Material.DIAMOND_BOOTS || i.getType() == Material.GOLD_BOOTS || i.getType() == Material.LEATHER_BOOTS) {
                                    i.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 4);
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    player.sendMessage(ChatColor.RED + "Error enchanting your items");
                    e.printStackTrace();
                }
            }
            if (args.length == 2) {
                try {
                    Enchantment en = Enchantment.getByName(args[0].toUpperCase());
                    player.getInventory().getItemInMainHand().addUnsafeEnchantment(en, Integer.parseInt(args[1]));
                    //player.getItemInHand().addUnsafeEnchantment(en, Integer.parseInt(args[1]));
                    player.sendMessage(ChatColor.GREEN + "You enchanted your " + player.getItemInHand().getType().name().toLowerCase().replace('_', ' ') + " with " + en.getName().replace("_", " ") + " " + args[1]);
                } catch (Exception e) {
                    player.sendMessage(ChatColor.RED + "Error enchanting your item");
                }
                return true;
            }
            if (args.length == 3) {
                try {
                    Player p = this.plugin.getServer().getPlayer(args[2]);
                    Enchantment en = Enchantment.getByName(args[0].toUpperCase());
                    //p.getItemInHand().addUnsafeEnchantment(en, Integer.parseInt(args[1]));
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(en, Integer.parseInt(args[1]));
                    player.sendMessage(ChatColor.GREEN + "You enchanted " + p.getDisplayName() + "'s " + player.getItemInHand().getType().name().toLowerCase().replace('_', ' ') + " with " + en.getName().replace("_", " ") + " " + args[1]);
                    p.sendMessage(ChatColor.GREEN + player.getDisplayName() + " enchanted your " + player.getItemInHand().getType().name().toLowerCase().replace('_', ' ') + " with " + en.getName().replace("_", " ") + " " + args[1]);

                } catch (Exception e) {
                    player.sendMessage(ChatColor.RED + "Error enchanting " + args[2] + "'s item");
                }
            }
        }
        return true;
    }
}
