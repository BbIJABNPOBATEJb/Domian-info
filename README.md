# 🛰 DomianInfo

🔎 **DomianInfo** is a simple Minecraft plugin (Spigot/Paper) that displays extended information in the console during a player's pre-connection stage.

## 📦 Package: `me.bbijabnpobatejb.domianInfo`

## 📋 Features

The plugin registers a listener for the `AsyncPlayerPreLoginEvent` and outputs the following details to the **server console (logs)**:

* 👤 **Player Name**
* 🔑 **Player UUID**
* 🌐 **IP Address**
* 🧱 **Raw IP Address**
* 🌍 **Hostname** (domain name, if available)
* 🔁 **Proxy Status** (checks if the player was transferred via proxy)
* ✅ **Login Result** (status of the connection attempt)
* ❌ **Kick Reason** (displayed if the login is rejected)
