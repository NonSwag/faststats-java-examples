java.toolchain.languageVersion = JavaLanguageVersion.of(17)

tasks.compileJava {
    options.release.set(17)
}

dependencies {
    implementation("dev.faststats.metrics:core:0.30.2")
}
