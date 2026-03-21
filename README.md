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

## ReleaseTrace testing checklist
1. Create a release run from `v1.1.0` to `v1.2.0`.
2. Validate that labeled PRs are detected with their categories (`feature`, `fix`, `performance`, `docs`).
3. Validate that the direct `chore` commit appears as commit-level source.
4. Compare `PUBLIC_NOTES` vs `QA_SUMMARY` and `SUPPORT_SUMMARY` outputs.
