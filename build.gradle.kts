plugins {
    id("com.gradle.build-scan") version "2.1"
    `java-library`
}

buildScan {
    server = "https://e.grdev.net"
    publishAlways()
}

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // This dependency is exported to consumers, that is to say found on their compile classpath.
    api("org.apache.commons:commons-math3:3.6.1")

    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation("com.google.guava:guava:26.0-jre")

    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
}
