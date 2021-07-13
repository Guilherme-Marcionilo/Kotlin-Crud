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
    kapt("io.micronaut.spring:micronaut-spring-annotation")
    kapt("io.micronaut.spring:micronaut-spring-web-annotation")
    implementation("io.micronaut:micronaut-http-client")
    implementation("io.micronaut:micronaut-http-server")
    implementation("io.micronaut:micronaut-runtime")
    implementation("io.micronaut.data:micronaut-data-hibernate-jpa")
    implementation("io.micronaut.kotlin:micronaut-kotlin-runtime")
    implementation("io.micronaut.sql:micronaut-jdbc-hikari")
    implementation("javax.annotation:javax.annotation-api")
    implementation("org.jetbrains.kotlin:kotlin-reflect:${kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${kotlinVersion}")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("io.micronaut.sql:micronaut-hibernate-jpa")
    runtimeOnly("ch.qos.logback:logback-classic")
    compile("com.h2database:h2")
    runtimeOnly("io.micronaut.spring:micronaut-spring-web")
    kaptTest("io.micronaut.spring:micronaut-spring-annotation")
    kaptTest("io.micronaut.spring:micronaut-spring-web-annotation")
    implementation("io.micronaut:micronaut-validation")
    runtime("io.micronaut.sql:micronaut-jdbc-hikari")
    runtimeOnly("com.fasterxml.jackson.module:jackson-module-kotlin")
    testImplementation("io.mockk:mockk:1.10.6")
    implementation("io.micronaut:micronaut-management")

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
