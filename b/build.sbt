organization := "example"
name := "b"
version := "0.0.1-SNAPSHOT"


libraryDependencies ++= Seq(
  "example" %% "a" % "0.0.1-SNAPSHOT",
  "example" %% "a" % "0.0.1-SNAPSHOT" % Test classifier "tests" // reusing some of a's test infrastructure
)
