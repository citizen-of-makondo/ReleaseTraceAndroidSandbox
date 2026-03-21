package com.releasetrace.sandbox

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val descriptionText = findViewById<MaterialTextView>(R.id.descriptionText)
        val versionText = findViewById<MaterialTextView>(R.id.versionText)
        val highlightsText = findViewById<MaterialTextView>(R.id.highlightsText)
        val qaFocusText = findViewById<MaterialTextView>(R.id.qaFocusText)
        val knownIssuesText = findViewById<MaterialTextView>(R.id.knownIssuesText)

        descriptionText.text = getString(R.string.sandbox_description_v2)
        versionText.text = getString(R.string.app_version_display)
        highlightsText.text = formatBulletList(
            ReleaseSummary.highlights,
            getString(R.string.highlights_empty),
        )
        qaFocusText.text = formatBulletList(
            ReleaseSummary.qaFocus,
            getString(R.string.qa_focus_empty),
        )
        knownIssuesText.text = formatBulletList(
            ReleaseSummary.knownIssues,
            getString(R.string.known_issues_empty),
        )
    }

    private fun formatBulletList(items: List<String>, emptyText: String): String {
        if (items.isEmpty()) {
            return "• $emptyText"
        }

        val estimatedLength = items.sumOf { it.length + 3 }
        val builder = StringBuilder(estimatedLength)
        items.forEachIndexed { index, item ->
            if (index > 0) {
                builder.append('\n')
            }
            builder.append("• ").append(item)
        }
        return builder.toString()
    }
}
