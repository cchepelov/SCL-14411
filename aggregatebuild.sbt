lazy val a = ProjectRef(file("a"),"a")
lazy val b = ProjectRef(file("b"),"b")
lazy val c = ProjectRef(file("c"),"c")

aggregateProjects(a,b,c) // not required