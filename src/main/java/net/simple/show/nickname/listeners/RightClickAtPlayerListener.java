package net.simple.show.nickname.listeners;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class RightClickAtPlayerListener implements Listener {
    @EventHandler
    public void onRightClick(PlayerInteractAtEntityEvent event) {
        if (event.getRightClicked() instanceof Player player) {
            event.getPlayer().spigot()
                    .sendMessage(
                            ChatMessageType.ACTION_BAR, new TextComponent("§6«§f" + player.getName() + "§6»")
                    );
        }
    }
}
