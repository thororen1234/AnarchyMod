# AnarchyMod

[![Build](https://github.com/6b6t/AnarchyMod/actions/workflows/build.yml/badge.svg)](https://github.com/6b6t/AnarchyMod/actions/workflows/build.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

🔓 The Minecraft mod required to play on 6b6t - bypass Mojang's ban of the world's biggest anarchy server.

## Features

- **Server unblocking** - bypasses Mojang's blocked server list for known anarchy servers
- **Auto server list** - automatically adds 6b6t to your server list if not already present
- **Join notification** - sends a lightweight packet to the server on join for analytics

## Supported Minecraft Versions

Each release publishes one JAR per Minecraft version, named `anarchymod-mc-<version>-<release>.jar` (e.g. `anarchymod-mc-1.21.11-1.3.2.jar`) - grab the one matching your game version from [Releases](https://github.com/6b6t/AnarchyMod/releases).

| Minecraft versions | Required Java |
|:-------------------|:-------------:|
| 1.14.3 - 1.14.4    | 8             |
| 1.15 - 1.15.2      | 8             |
| 1.16 - 1.16.5      | 8             |
| 1.17 - 1.17.1      | 17            |
| 1.18 - 1.18.2      | 17            |
| 1.19 - 1.19.4      | 17            |
| 1.20 - 1.20.4      | 17            |
| 1.20.5 - 1.20.6    | 21            |
| 1.21 - 1.21.11     | 21            |
| 26.1 - 26.2        | 25            |

## Installation

AnarchyMod is required to connect to and play on 6b6t.

1. Install [Fabric Loader](https://fabricmc.net/) for your Minecraft version
2. Download the matching JAR from [Releases](https://github.com/6b6t/AnarchyMod/releases)
3. Place the JAR in your `.minecraft/mods` folder

## Building from Source

Requires Java 25+ for the full multi-version build.

```sh
git clone https://github.com/6b6t/AnarchyMod.git
cd AnarchyMod
./gradlew build
```

Built JARs are located in each module's `build/libs/` directory.

## License

[MIT](LICENSE)
