repositories {
    mavenCentral()
    maven("https://repo.nexomc.com/releases") // Official Nexo repository
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly(project(":api"))
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
    // Using the latest stable 1.x release (format: 1.X.0)
    compileOnly("com.nexomc:nexo:1.1.0") // Changed to stable release format
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release.set(21)
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}