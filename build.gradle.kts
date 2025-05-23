plugins {
    kotlin("jvm") version "2.1.10"
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "zephyr"
    version = "1.0"

    repositories {
        mavenCentral()
    }

    kotlin {
        jvmToolchain(8)
    }
}