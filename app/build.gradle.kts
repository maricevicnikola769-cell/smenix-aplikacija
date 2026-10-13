plugins {
    id("com.android.application")
}

android {
    // ===== PROMENITE OVO ZA SVOJU APLIKACIJU =====
    namespace = "com.example.html2apk"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.nikola.smenix"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
    // =============================================

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    // Vaši HTML fajlovi se uzimaju iz foldera "html" u korenu projekta
    sourceSets["main"].assets.srcDirs("../html")

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.webkit:webkit:1.12.1")
}
