pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

rootProject.name = "Kache"
include("internal-collections")
include("kache-common")
include(":kache")
include(":file-kache-common")
include(":file-kache-base")
include(":file-kache")
include(":file-kache-okio")