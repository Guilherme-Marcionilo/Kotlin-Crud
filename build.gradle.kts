plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.32"
    id("org.jetbrains.kotlin.kapt") version "1.4.32"
    id("com.github.johnrengelman.shadow") version "7.0.0"
    id("io.micronaut.application") version "1.5.3"
    id("org.jetbrains.kotlin.plugin.jpa") version "1.4.32"
    id("org.jetbrains.kotlin.plugin.noarg") version "1.5.20"
    id("org.jetbrains.kotlin.plugin.allopen") version "1.5.20"
}

allOpen {
    annotation("io.micronaut.http.annotation.Controller")
}

version = "0.1"
group = "br.com.zup"

val kotlinVersion = project.properties.get("kotlinVersion")
repositories {
    mavenCentral()
}

micronaut {
    runtime("netty")
    testRuntime("kotest")
    processing {
        incremental(true)
        annotations("br.com.zup.*")
    }
}

dependencies {
    kapt("io.micronaut.data:micronaut-data-processor")
    implementation("io.micronaut:micronaut-http-client")
    implementation("io.micronaut:micronaut-runtime")
    implementation("io.micronaut.data:micronaut-data-hibernate-jpa")
    implementation("io.micronaut.kotlin:micronaut-kotlin-runtime")
    implementation("io.micronaut.sql:micronaut-jdbc-hikari")
    implementation("javax.annotation:javax.annotation-api")
    implementation("org.jetbrains.kotlin:kotlin-reflect:${kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${kotlinVersion}")
    runtimeOnly("ch.qos.logback:logback-classic")
    implementation("io.micronaut:micronaut-validation")
    implementation("io.micronaut:micronaut-management")
    implementation("io.micronaut.cassandra:micronaut-cassandra")
    implementation("io.springfox:springfox-swagger-ui:3.0.0")
    implementation("io.swagger.core.v3:swagger-annotations")

    kaptTest ("io.micronaut:micronaut-inject-java")
    testImplementation ("io.micronaut.test:micronaut-test-kotest:2.3.3")
    testImplementation ("io.mockk:mockk:1.10.6")
    testImplementation ("io.kotest:kotest-runner-junit5-jvm:4.3.0")

    runtimeOnly("com.fasterxml.jackson.module:jackson-module-kotlin")
    kapt("io.micronaut.openapi:micronaut-openapi:2.6.0")

}
kapt {
    arguments {
        arg("micronaut.openapi.server.context.path", "/toy/documentation")
        arg("micronaut.openapi.views.spec", "redoc.enabled=true,rapidoc.enabled=true,swagger-ui.enabled=true,swagger-ui.theme=flattop")
    }
}

application {
    mainClass.set("br.com.zup.ApplicationKt")
}
java {
    sourceCompatibility = JavaVersion.toVersion("11")
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }
    compileTestKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }
}
