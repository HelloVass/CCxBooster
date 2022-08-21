project.extra["mainApp"] = true

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

apply(from = rootProject.file("booster.gradle"))
apply(from = rootProject.file("cc-settings-2.gradle"))

android {

    compileSdkVersion(33)

    defaultConfig {
        applicationId = "info.hellovass.ccboostertest"
        minSdkVersion(21)
        targetSdkVersion(33)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        @Suppress("UNUSED_VARIABLE")
        val release by getting {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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
    implementation(project(":library"))
    implementation("com.squareup.okhttp3:okhttp-tls:3.12.1")
    implementation("androidx.appcompat:appcompat:1.5.0")
    implementation("com.google.android.material:material:1.6.1")
}