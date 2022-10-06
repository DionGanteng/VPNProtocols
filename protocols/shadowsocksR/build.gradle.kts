plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-parcelize")
}

setupLibraryModule("com.dionganteng.shadowsocksr", true)

dependencies {
    api(libs.tim.base)
}