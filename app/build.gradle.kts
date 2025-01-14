plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.ksp)
    alias(libs.plugins.anvil)
}

dependencies {
    implementation(project(":utils"))
    implementation(project(":feature-list"))
    kapt(libs.dagger.daggerCompiler)
    implementation(libs.dagger.dagger)
    implementation(libs.anvil.annotations)
    implementation(libs.anvilUtils.annotations)
}

anvil {
    useKsp(contributesAndFactoryGeneration = true)
}
