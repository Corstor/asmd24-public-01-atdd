ThisBuild / version := "0.1.0-SNAPSHOT"
val scala3Version = "3.4.2"
lazy val root = (project in file("."))
  .settings(
    name := "asmd24-01-atdd",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
        "net.aichler" % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
        "io.cucumber" %% "cucumber-scala" % "8.26.1" % Test,
        "io.cucumber" % "cucumber-java" % "7.21.1" % Test)

)
