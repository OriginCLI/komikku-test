# PalGuide for Android

PalGuide is an offline-first fan companion for Palworld. It packages a searchable Palworld 1.0 Paldex and reverse breeding matrix inside a small native Android WebView app, while linking to a maintained live map for current spawn information.

## Included in v0.1.0

- Desired-child breeding calculator
- Parent combinations sorted by the lowest Paldeck numbers
- Optional prioritization of pairs whose parents are marked owned
- Searchable Paldex with type, work-suitability, owned, and favorite filters
- Persistent base essentials checklists
- Offline coordinate pins
- Current Tracker.Game map access
- No account, analytics, ads, or bundled game artwork

## Breeding order

For a selected child, each parent pair is normalized so the lower-numbered parent appears first. Results are then sorted by that lower Paldeck number and, when tied, by the second parent number. Enabling **Prioritize pairs I already own** moves complete owned pairs above incomplete pairs without changing their low-number order inside each group.

## Data policy

The build workflow extracts the numbered Paldeck entries, work levels, elements, breeding ranks, and unique combinations from the MIT-licensed `palcalc-tools/palworld-1.0-calculator` project. It recreates the Palworld 1.0 breeding algorithm and generates a reverse child-to-parents matrix during every APK build. Unnumbered crossover and boss records are intentionally excluded because they cannot be meaningfully ranked by Paldeck number.

If the upstream source is temporarily unavailable, the project retains a clearly labeled small fallback sample instead of silently presenting old data as current. The APK also provides a Live Map link for update-specific spawn information.

See `THIRD_PARTY_NOTICES.md` for attribution and licensing notes.

## Build on Windows 11

1. Install Android Studio with Android SDK 35 and JDK 17.
2. Open the `palguide` folder.
3. Allow Gradle to sync.
4. Run the `app` configuration, or use `gradlew.bat assembleDebug` after generating a Gradle wrapper.

The GitHub Actions workflow builds an installable debug-signed APK automatically.

## Disclaimer

PalGuide is a fan-made project and is not affiliated with or endorsed by Pocketpair. Palworld names, game data, and related marks belong to their respective owners.
