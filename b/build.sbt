lazy val a = ProjectRef(file("../a"), "a")
lazy val b = project.in(file(".")).dependsOn(a)