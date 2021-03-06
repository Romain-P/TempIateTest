plugins {
    kotlin("jvm") version "1.3.72"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.eclipse.jgit:org.eclipse.jgit:5.7.0.202003110725-r")
    implementation("org.springframework:spring-web:3.0.2.RELEASE")
    implementation("junit:junit:4.13")
    implementation("io.ktor:ktor-server-core:1.4.0")
    implementation("io.ktor:ktor-server-netty:1.4.0")
    implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}
