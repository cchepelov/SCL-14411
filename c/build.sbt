lazy val a = ProjectRef(file("../a"), "a")
lazy val c = project.in(file(".")).dependsOn(a)