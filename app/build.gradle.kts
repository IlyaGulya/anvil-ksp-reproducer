plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.ksp)
    alias(libs.plugins.anvil)
    application
}

application {
    mainClass = "com.example.myapplication.test.MainKt"
}

dependencies {
    ksp(project(":my-processor"))
//    kapt(libs.dagger.daggerCompiler)
    implementation(libs.dagger.dagger)
    implementation(libs.anvil.annotations)
}

anvil {
    useKsp(contributesAndFactoryGeneration = true)
    generateDaggerFactories = true
}
