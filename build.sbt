lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.13.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scala-algorithms",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.8",
	libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)

