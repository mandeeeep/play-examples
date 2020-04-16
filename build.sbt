lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-examples""",
    organization := "com.example",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
      ws,
      "net.codingwell" %% "scala-guice" % "4.2.6"
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
