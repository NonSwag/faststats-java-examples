plugins {
    id("net.fabricmc.fabric-loom") version "1.15-SNAPSHOT"
}

java.toolchain.languageVersion = JavaLanguageVersion.of(25)

tasks.compileJava {
    options.release.set(25)
}

dependencies {
    compileOnly("org.jspecify:jspecify:1.0.0")
    compileOnly("net.fabricmc:fabric-loader:0.19.5")
    implementation("dev.faststats.metrics:fabric:0.30.2+mc26.1-26.3")
    include("dev.faststats.metrics:fabric:0.30.2+mc26.1-26.3")
    minecraft("com.mojang:minecraft:26.2")
}
