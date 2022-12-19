plugins {
    id("org.jetbrains.intellij") version "1.11.0"
    kotlin("jvm") version "1.7.20"
    idea
    java
}

sourceSets.main.get().java.srcDir( "src/main/gen" )
idea.module.generatedSourceDirs.add( file("src/main/gen") )

repositories.mavenCentral()

dependencies {
	testImplementation( kotlin("script-runtime") )
	testImplementation( "org.junit.jupiter:junit-jupiter" )
	testImplementation( platform( "org.junit:junit-bom:5.9.1" ) )
	// -- from old code --
	testImplementation( "org.hamcrest:hamcrest:2.2" )
	testImplementation("org.assertj:assertj-core:3.23.1")
}

intellij {
    version.set( "2022.2" )
    type.set("IC") // Target IDE Platform

    plugins.set( listOf( "com.intellij.java" ) )
}

tasks {
	compileJava {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }

	compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }

    patchPluginXml {
        sinceBuild.set("222")
        untilBuild.set("240.*")
        changeNotes.set( projectDir.resolve("changelog").readText() )
    }

    signPlugin {
        certificateChain.set( System.getenv("CERTIFICATE_CHAIN") )
        privateKey.set( System.getenv("PRIVATE_KEY") )
        password.set( System.getenv("PRIVATE_KEY_PASSWORD") )
    }

    publishPlugin {
        token.set( System.getenv("PUBLISH_TOKEN") )
    }
}
