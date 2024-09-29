plugins {
    kotlin("jvm") version "2.0.20"
    application
}

group = "com.pavelkarateev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.1")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.11.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}
