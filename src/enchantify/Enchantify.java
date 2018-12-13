/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enchantify;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Andrew
 */
public class Enchantify extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("enchant").setExecutor(new Cmd(this));
    }
    
    @Override
    public void onDisable() {
        
    }
}
