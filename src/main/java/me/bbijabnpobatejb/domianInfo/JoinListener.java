package me.bbijabnpobatejb.domianInfo;

import lombok.val;
import me.bbijabnpobatejb.domianInfo.DomianInfo;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void on(AsyncPlayerPreLoginEvent event) {
        val logger = DomianInfo.instance.getLogger(); // ты упомянул DomianInfo — -> свой main класс

        StringBuilder sb = new StringBuilder();
        sb.append("\n==============================\n")
                .append("➡️ Игрок подключается:\n")
                .append("👤 Имя: ").append(event.getName()).append("\n")
                .append("🔑 UUID: ").append(event.getUniqueId()).append("\n")
                .append("🌐 IP: ").append(event.getAddress().getHostAddress()).append("\n")
                .append("🧱 Raw IP: ").append(event.getRawAddress().getHostAddress()).append("\n")
                .append("🌍 Hostname (домен): ").append(event.getHostname().isEmpty() ? "<неизвестно>" : event.getHostname()).append("\n")
                .append("🔁 Transferred (прокси?): ").append(event.isTransferred()).append("\n")
                .append("✅ Login result: ").append(event.getLoginResult()).append("\n");

        // Если игрок будет кикнут — покажем причину
        if (event.getLoginResult() != AsyncPlayerPreLoginEvent.Result.ALLOWED) {
            sb.append("❌ Kick message: ").append(
                    LegacyComponentSerializer.legacySection().serialize(event.kickMessage())
            ).append("\n");
        }

        sb.append("==============================");

        logger.info(sb.toString());
    }
}