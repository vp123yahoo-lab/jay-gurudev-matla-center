
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.jaygurudev.matlacenter"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.jaygurudev.matlacenter"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
