// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies{
        classpath("com.google.gms:google-services:4.3.15")
    }
}
plugins {
    id("com.android.application") apply false
    id("com.android.library") apply false
    id("org.jetbrains.kotlin.android") apply false
}