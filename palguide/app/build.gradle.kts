plugins {
    id("com.android.application")
}

android {
    namespace = "com.keean.palguide"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.keean.palguide"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
