rootProject.name = "VPNProtocols"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

include(
    ":sample",
    ":base:basevpn",
    ":protocols:shadowsocksR"
)
