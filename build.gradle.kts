plugins { id("io.vacco.oss.gitflow") version "1.0.1" }

group = "io.vacco.nugui"
version = "0.2.5"

configure<io.vacco.oss.gitflow.GsPluginProfileExtension> {
  sharedLibrary(true, false)
  addJ8Spec()
}

dependencies {
  implementation("com.google.protobuf:protobuf-java:4.28.2")
  implementation("com.google.code.gson:gson:2.11.0")
}