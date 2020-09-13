import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    application
}
group = "me.gabom"
version = "1.0-SNAPSHOT"

configurations {}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-junit5"))

    val jUnitVersion = "5.3.1"
    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", jUnitVersion)
    // IDEA needs those:
    testCompileOnly("org.junit.jupiter", "junit-jupiter-api", jUnitVersion)
    testCompileOnly("org.junit.jupiter", "junit-jupiter-params", jUnitVersion)

    // Cucumber
    testImplementation("io.cucumber:cucumber-java8:6.6.1")
    testImplementation("io.cucumber:cucumber-junit:6.6.1")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClassName = "MainKt"
}