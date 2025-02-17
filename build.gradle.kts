import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.kotlin.jvm).apply(false)
    alias(libs.plugins.kotlin.serialization).apply(false)
    alias(libs.plugins.kotlin.kapt).apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

gradle.afterProject {
    pluginManager.withPlugin(libs.plugins.kotlin.jvm.get().pluginId) {
        the<KotlinProjectExtension>().apply {
            jvmToolchain(17)
        }
    }
}