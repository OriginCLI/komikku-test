# PalGuide for Android

PalGuide is an offline-first fan companion for Palworld. It packages a searchable community Paldex and reverse breeding matrix inside a small native Android WebView app, while linking to a maintained live map for current spawn information.

## Included in v0.1.0

- Desired-child breeding calculator
- Parent combinations sorted by the lowest Paldeck numbers
- Optional prioritization of pairs whose parents are marked owned
- Searchable Paldex with type, work-suitability, owned, and favorite filters
- Persistent base essentials checklists
- Offline coordinate pins
- Current Tracker.Game map access
- No account, analytics, ads, or bundled game artwork

## Data policy

The build workflow downloads the open community `pals.json` and `breeding.json` files from `mlg404/palworld-paldex-api`. If that source is unavailable, the app still builds with a small fallback sample. Because Palworld data changes, the app labels the bundled data as an offline snapshot and provides a Live Map link for current information.

## Build on Windows 11

1. Install Android Studio with Android SDK 35 and JDK 17.
2. Open the `palguide` folder.
3. Allow Gradle to sync.
4. Run the `app` configuration, or use `gradlew.bat assembleDebug` after generating a Gradle wrapper.

The GitHub Actions workflow builds an installable debug-signed APK automatically.

## Disclaimer

PalGuide is a fan-made project and is not affiliated with Pocketpair. Palworld names and related marks belong to their respective owners.
