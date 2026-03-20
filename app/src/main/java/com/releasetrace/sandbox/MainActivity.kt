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

        descriptionText.text = getString(R.string.sandbox_description_v2)
        versionText.text = getString(R.string.app_version_display)
        highlightsText.text = ReleaseSummary.highlights.joinToString(separator = "\n") { "• $it" }
        qaFocusText.text = ReleaseSummary.qaFocus.joinToString(separator = "\n") { "• $it" }
    }
}
