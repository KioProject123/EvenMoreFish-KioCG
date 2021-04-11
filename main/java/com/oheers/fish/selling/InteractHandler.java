package com.oheers.fish.selling;

import com.oheers.fish.EvenMoreFish;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InteractHandler implements Listener {

    @EventHandler
    public void interact(InventoryClickEvent event) {
        if (GUICache.isOpenSellGUI((Player) event.getWhoClicked())) {
            SellGUI gui = GUICache.getSellGUI((Player) event.getWhoClicked());
            ItemStack clickedItem = event.getClickedInventory().getItem(event.getSlot());
            if (clickedItem != null) {
                if (clickedItem.isSimilar(gui.getSellIcon())) {
                    gui.createConfirmIcon(event.getView().getTopInventory());
                    gui.setConfirmIcon();

                    gui.setModified(false);
                    event.setCancelled(true);
                } else if (clickedItem.isSimilar(gui.getConfirmIcon())) {
                    event.setCancelled(true);
                    if (gui.getModified()) {
                        gui.createConfirmIcon(event.getView().getTopInventory());
                        gui.setConfirmIcon();

                        gui.setModified(false);
                    } else {
                        gui.close();
                        // do all the selling stuff
                    }
                } else if (clickedItem.isSimilar(gui.getFiller())) {
                    event.setCancelled(true);
                } else {
                    gui.setSellItem(event.getView().getTopInventory());
                    gui.setModified(true);
                }
            } else {
                gui.setSellItem(event.getInventory());
            }
        }
    }

    @EventHandler
    public void close(InventoryCloseEvent event) {
        GUICache.attemptPop((Player) event.getPlayer());
    }
}
