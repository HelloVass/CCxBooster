buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
        // AGP
        classpath("com.android.tools.build:gradle:4.0.0")
        // KGP
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.20")
        classpath("com.billy.android:cc-register:1.1.2")
        // booster
        classpath("com.didiglobal.booster:booster-gradle-plugin:4.11.0")
        // 线程监控
        classpath("com.didiglobal.booster:booster-transform-thread:4.11.0")
    }
}

subprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}

val clean by tasks.creating(Delete::class) {
    delete(rootProject.buildDir)
}