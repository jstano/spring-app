rootProject.name = "spring-app"

pluginManagement {
  repositories {
    mavenLocal()
    gradlePluginPortal()
  }
}

plugins {
  id("com.stano.settings") version "0.1.7-SNAPSHOT"
}

include("adapter-rest-api")
include("application-contracts")
include("application-services")
include("domain")
include("schema")
include("spring-configuration")
include("spring-launcher")
