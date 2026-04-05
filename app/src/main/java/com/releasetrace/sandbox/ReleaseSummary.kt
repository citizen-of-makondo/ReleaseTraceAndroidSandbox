package com.releasetrace.sandbox

object ReleaseSummary {
    val highlights = listOf(
        "Refreshed the release summary with clearer version and note copy.",
        "Updated the home screen messaging so QA and support can scan changes faster.",
        "Kept release highlights, QA focus, and known issues grouped for easier review.",
    )

    val qaFocus = listOf(
        "Verify the release summary still reads cleanly after rotation.",
        "Check that long highlight text wraps without clipping on smaller displays.",
        "Confirm the known issues block remains visible at the bottom of the screen.",
    )

    val knownIssues = listOf(
        "Known issues are informational in this sandbox build and are not synced from a backend.",
    )
}
