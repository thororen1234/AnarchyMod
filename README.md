# AnarchyMod

[![Build](https://github.com/6b6t/AnarchyMod/actions/workflows/build.yml/badge.svg)](https://github.com/6b6t/AnarchyMod/actions/workflows/build.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

🔓 The Minecraft mod required to play on 6b6t - bypass Mojang's ban of the world's biggest anarchy server.

## Features

- **Server unblocking** - bypasses Mojang's blocked server list for known anarchy servers
- **Auto server list** - automatically adds 6b6t to your server list if not already present
- **Join notification** - sends a lightweight packet to the server on join for analytics

## Supported Minecraft Versions

| Minecraft | Module       |
|-----------|--------------|
| 1.14.4    | `mc-1.14.4`  |
| 1.15      | `mc-1.15`    |
| 1.15.1    | `mc-1.15.1`  |
| 1.15.2    | `mc-1.15.2`  |
| 1.16      | `mc-1.16`    |
| 1.16.1    | `mc-1.16.1`  |
| 1.16.2    | `mc-1.16.2`  |
| 1.16.3    | `mc-1.16.3`  |
| 1.16.4    | `mc-1.16.4`  |
| 1.16.5    | `mc-1.16.5`  |
| 1.17      | `mc-1.17`    |
| 1.17.1    | `mc-1.17.1`  |
| 1.18      | `mc-1.18`    |
| 1.18.1    | `mc-1.18.1`  |
| 1.18.2    | `mc-1.18.2`  |
| 1.19      | `mc-1.19`    |
| 1.19.1    | `mc-1.19.1`  |
| 1.19.2    | `mc-1.19.2`  |
| 1.19.3    | `mc-1.19.3`  |
| 1.19.4    | `mc-1.19.4`  |
| 1.20      | `mc-1.20`    |
| 1.20.1    | `mc-1.20.1`  |
| 1.20.2    | `mc-1.20.2`  |
| 1.20.3    | `mc-1.20.3`  |
| 1.20.4    | `mc-1.20.4`  |
| 1.20.5    | `mc-1.20.5`  |
| 1.20.6    | `mc-1.20.6`  |
| 1.21      | `mc-1.21`    |
| 1.21.1    | `mc-1.21.1`  |
| 1.21.2    | `mc-1.21.2`  |
| 1.21.3    | `mc-1.21.3`  |
| 1.21.4    | `mc-1.21.4`  |
| 1.21.5    | `mc-1.21.5`  |
| 1.21.6    | `mc-1.21.6`  |
| 1.21.7    | `mc-1.21.7`  |
| 1.21.8    | `mc-1.21.8`  |
| 1.21.9    | `mc-1.21.9`  |
| 1.21.10   | `mc-1.21.10` |
| 1.21.11   | `mc-1.21.11` |
| 26.1      | `mc-26.1`    |
| 26.1.1    | `mc-26.1.1`  |
| 26.1.2    | `mc-26.1.2`  |
| 26.2      | `mc-26.2`    |

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
