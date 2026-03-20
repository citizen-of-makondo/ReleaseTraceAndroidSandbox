# ReleaseTrace Android Sandbox

Minimal Android app repository for testing release-note generation flows.

## Tech stack
- Kotlin
- Android Views (XML)
- Android Gradle Plugin

## Local run
1. Ensure Android SDK is installed.
2. Create `local.properties` with SDK path:
   - `sdk.dir=/Users/<your_user>/Library/Android/sdk`
3. Build debug APK:
   - `./gradlew :app:assembleDebug`

## Planned releases
- `v1.0.0` - baseline empty app shell.
- `v1.1.0` - improved home screen content and structured release info.

