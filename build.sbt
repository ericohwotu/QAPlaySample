name := "PlaySample"

version := "1.0"

scalaVersion := "2.11.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += "com.typesafe.play" % "play_2.11" % "2.5.16"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0" % Test
        