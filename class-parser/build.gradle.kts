plugins {
    kotlin("jvm") version "2.4.10"
    kotlin("plugin.serialization") version "2.4.10"
    application
}

group = "de.rubixdev"
version = "1.0-SNAPSHOT"

application {
    mainClass = "de.rubixdev.MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.bcel:bcel:6.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
}

kotlin {
    jvmToolchain(21)
}
