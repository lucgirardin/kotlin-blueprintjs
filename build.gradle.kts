plugins {
    kotlin("js") version "1.4.20-M2"
}

repositories {
    jcenter()
    maven {
        url = uri("https://dl.bintray.com/kotlin/kotlin-dev")
    }
    maven {
        url = uri("https://dl.bintray.com/kotlin/kotlinx/")
    }
    // repository added for kotlin-wrappers resolutions
    maven(url = "https://kotlin.bintray.com/kotlin-js-wrappers")
}

val kotlinWrappersVersion = "pre.123-kotlin-1.4.10"

kotlin {
    js {
        browser()
        useCommonJs()
    }
    sourceSets {
        main {
            dependencies {
                implementation(kotlin("stdlib-js"))

                val reactVersion = "16.13.1"
                implementation("org.jetbrains:kotlin-react:$reactVersion-$kotlinWrappersVersion")
                implementation(npm("react", reactVersion))
                implementation("org.jetbrains:kotlin-react-dom:$reactVersion-$kotlinWrappersVersion")
                implementation(npm("react-dom", reactVersion))

                api(npm("@blueprintjs/core", "3.35.0"))
                api(npm("@blueprintjs/icons", "3.22.0"))
                api(npm("@types/react", "16.9.56"))
                api(npm("@types/react-dom", "16.9.9"))
            }
        }
        test {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}
