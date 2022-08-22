

lazy val root = project
  .in(file("."))
  .settings(
    name := "checkout",
    description := "checkout project",
    version := "0.1.0",
    scalaVersion := "3.1.3",
    libraryDependencies ++= Seq(
        "org.scalameta" %% "munit" % "0.7.29" % Test,
        "org.scalatest" %% "scalatest" % "3.2.13" % Test
    )
  )
