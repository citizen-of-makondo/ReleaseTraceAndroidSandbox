# Changelog

## v1.3.0 - 2026-04-05
- Refresh the release summary copy for clearer product, QA, and support scanning.
- Improve release summary rendering by trimming empty list items and reading the version from package metadata.
- Bump the app version metadata to 1.3.0 for release-note testing.

## v1.2.0 - 2026-03-21
- Add Known issues block to release summary screen.
- Add empty-state fallbacks for release, QA, and issue sections.
- Reduce string allocation overhead while building bullet lists.
- Document release-notes testing flow for ReleaseTrace.

## v1.1.0 - 2026-03-20
- Add structured release summary on the home screen.
- Show runtime app version in UI (`BuildConfig.VERSION_NAME`).
- Add explicit QA checklist items in the app content.
- Improve product-facing copy for easier demo and release communication.

## v1.0.0 - 2026-03-20
- Initialize Android sandbox project.
- Add single `MainActivity` with basic static screen.
- Configure Gradle and app module for Kotlin Android app.
