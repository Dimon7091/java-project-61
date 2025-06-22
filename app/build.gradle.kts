plugins {
    id("java")
    id("com.github.ben-manes.versions") version "0.52.0"
    id("org.sonarqube") version "6.2.0.5505"
    application
    checkstyle
}
group = "hexlet.code"
version = "1.0-SNAPSHOT"
repositories {
    mavenCentral()
}

val mockitoVersion = "4.5.1"
dependencies {
    testImplementation("org.mockito:mockito-core:$mockitoVersion")
    testImplementation("org.mockito:mockito-inline:$mockitoVersion")
    implementation("org.apache.commons:commons-lang3:3.17.0")
}
application {
    mainClass.set("hexlet.code.App")
}

sonar {
    properties {
        property("sonar.projectKey", "Dimon7091_java-project-61")
        property("sonar.organization", "dmitry-gorbunov-linter")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}
checkstyle {
    toolVersion = "10.12.4"
    configFile = file("config/checkstyle/checkstyle.xml")
    isIgnoreFailures = false
}
tasks.check {
    dependsOn(tasks.checkstyleMain)
}
tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

