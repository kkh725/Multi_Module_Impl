plugins {
    alias(libs.plugins.multi.module.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.multi.module.hilt)
}

android {
    namespace = "com.kkh.multimodule.datastore"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.datastore)
}