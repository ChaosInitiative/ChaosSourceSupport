plugins {
    id("org.jetbrains.intellij") version "1.10.0"
    kotlin("jvm") version "1.6.21"
    id("idea")
    id("java")
}

idea {
    module {
        generatedSourceDirs.add( file("src/main/gen") )
    }
}

group = "com.enderzombi102"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.0")
    testImplementation( "org.hamcrest:hamcrest:2.2" )
    testImplementation("org.assertj:assertj-core:3.23.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}

intellij {
    version.set( "2022.2" )
    type.set("IC") // Target IDE Platform

    plugins.set( listOf( "com.intellij.java" ) )
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }

    patchPluginXml {
        sinceBuild.set("222")
        untilBuild.set("240.*")
        changeNotes.set(
            """
            Add change notes here.<br>
            <em>most HTML tags may be used</em>
            """
        )
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }
}

sourceSets {
    main {
        java {
            srcDir( "src/main/gen" )
        }
    }
}