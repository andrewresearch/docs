//name := "goingok-docs"
//version := "0.1.0"
//scalaVersion := "2.12.2"
//organization := "org.goingok"

lazy val root = (project in file(".")).
  enablePlugins(ParadoxPlugin).
  settings(
    name := "GoingOK Documentation",
    paradoxTheme := Some(builtinParadoxTheme("generic"))
  )