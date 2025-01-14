plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.ksp)
    alias(libs.plugins.anvil)
}

dependencies {
    ksp(libs.anvilUtils.compiler)
    ksp(project(":my-processor"))
//    ksp(libs.dagger.daggerCompiler)
    implementation(project(":utils"))
    implementation(libs.dagger.dagger)
    implementation(libs.anvil.annotations)
    implementation(libs.anvilUtils.annotations)
}

anvil {
    useKsp(contributesAndFactoryGeneration = true)
    generateDaggerFactories = true
}
