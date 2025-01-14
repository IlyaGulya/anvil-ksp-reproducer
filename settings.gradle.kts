pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "anvil-reproducer"
include(":app")
include(":utils")
include(":feature-list")
include(":my-processor")
