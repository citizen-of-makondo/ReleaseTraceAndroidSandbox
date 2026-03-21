package com.releasetrace.sandbox

object ReleaseSummary {
    val highlights = listOf(
        "Added a dedicated release status section with version visibility.",
        "Improved home screen copy to explain app purpose for QA and support.",
        "Structured highlights so updates are easier to scan by non-engineers.",
    )

    val qaFocus = listOf(
        "Verify launch screen renders version and highlights.",
        "Rotate device and ensure the content keeps readable spacing.",
        "Check long text clipping on smaller displays.",
    )

    val knownIssues = listOf(
        "In this sandbox build, known issues are informational and not yet synced from backend.",
    )
}
