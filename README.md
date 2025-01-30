# Modern Death Messages Plugin

A Minecraft plugin that displays modern elimination messages for all death types.

## Author
**9R3A**
- GitHub: [9R3A](https://github.com/9R3A)

## Features
- Modern elimination messages for all death types
- Configurable messages through config.yml
- Colored messages (white player name, red elimination text)
- Supports all Minecraft death causes

## Installation
1. Download the plugin jar file
2. Place it in your server's `plugins` folder
3. Restart your server
4. Configure in `plugins/ModernDeathMessages/config.yml`

## Configuration
The plugin uses a simple configuration file (config.yml):

### Color Codes
- `&f` - White (for player names)
- `&c` - Red (for elimination message)

### Placeholders
- `%player%` - Shows the player's name
- `%killer%` - Shows killer's name (PvP only)

## Building from Source

```bash
# Clone the repository
git clone https://github.com/9R3A/ModernDeathMessages.git

# Navigate to project directory
cd ModernDeathMessages

# Build with Maven
mvn clean package
```

The compiled plugin will be in `target/ModernDeathMessages-1.0-SNAPSHOT.jar`

## Requirements
- Java 8 or higher
- Spigot/Paper 1.13+
- Maven (for building)

## Supported Death Types
- PvP
- Fall damage
- Drowning
- Fire/Burning
- Lava
- Explosion
- Void
- Poison
- Magic
- Wither
- And more...

For a complete list of supported death types, check the config.yml file.
