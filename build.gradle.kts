// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false

    // system UI Controller
    impplementation("com.google.accompanist:accompanist-systemuicontroller:0.27.0")

    // Extended Icons
    impplementation("androidx.compose.material:material-icons-extended:1.5.4")
}