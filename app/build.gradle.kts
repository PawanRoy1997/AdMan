plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.simpleapps.adman.app"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.simpleapps.adman.app"
        minSdk = 19
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    Deps.Core.list.forEach{ implementation(it) }

    implementation(platform(Deps.Firebase.BOM))
    implementation(Deps.Firebase.analytics)

    testImplementation(Deps.UnitTesting.junit)

    Deps.Instrumentation.list.forEach { androidTestImplementation(it) }
}