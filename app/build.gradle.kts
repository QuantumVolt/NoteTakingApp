

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.ksp)
    alias(libs.plugins.safe.args)
    alias(libs.plugins.kotlin.parcelize)

}

android {
    namespace = "com.mastercoding.notetakingapp"
    compileSdk {
        version = release(37) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.mastercoding.notetakingapp"
        minSdk = 30
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures{
        dataBinding = true
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.fragment)
    implementation(libs.material)

    //Kotlin symbol processing KSP not kapt for kotlin Room-Compiler
    ksp(libs.room.compiler.ksp)
    implementation(libs.room.runtime)    //

    //couroutines
    implementation(libs.kotlin.couroutines)    //
    //Navigation fragment
    implementation(libs.navaigation.fragment)    //
    implementation(libs.navigation.ui)    // Navigation
    //lifecycle arch
    implementation(libs.lifecycle.viewmodel.ktx)    // View model
    implementation(libs.lifecycle.livedata.ktx)    // Live data
    implementation(libs.lifecycle.runtime.ktx)    //
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}