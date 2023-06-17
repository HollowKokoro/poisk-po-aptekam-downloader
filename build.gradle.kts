import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.kafka:kafka-clients:3.3.2")
    testImplementation("ch.qos.logback:logback-classic:1.4.5")
    implementation("org.seleniumhq.selenium:selenium-java:4.8.0")
    implementation("io.github.bonigarcia:webdrivermanager:5.3.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}
