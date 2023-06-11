object Deps {

    object Core {
        val androidCore = "androidx.core:core-ktx:1.10.1"
        val appCompat = "androidx.appcompat:appcompat:1.6.1"
        val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
        val material = "com.google.android.material:material:1.9.0"

        val list = listOf(androidCore, appCompat, constraintLayout, material)
    }

    object Firebase {
        val BOM = "com.google.firebase:firebase-bom:32.1.0"
        val analytics = "com.google.firebase:firebase-analytics-ktx"
    }

    object UnitTesting {
        val junit = "junit:junit:4.13.2"
    }

    object Instrumentation {
        val junit = "androidx.test.ext:junit:1.1.5"
        val espresso = "androidx.test.espresso:espresso-core:3.5.1"
        val list = listOf(junit, espresso)
    }
}