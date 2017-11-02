name := """example-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
routesGenerator :=InjectedRoutesGeneerator

enablePlugins(DebianPlugin)
maintainer := “Senthil Kumar <tmsenthil@gmail.com>"
packageSummary := "My custom package"
packageDescription := "Package"
