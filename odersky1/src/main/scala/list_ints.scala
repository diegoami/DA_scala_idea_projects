val oneTwo = List(1, 2)

val threeFour = List(3, 4)

val oneTwoThreeFour = oneTwo :: threeFour

val twoThree = List(2, 3)

val oneTwoThree = 1 :: twoThree

println(oneTwoThree)

println(oneTwoThreeFour)


val oneTwoThreeB = 1 :: 2 :: 3 :: Nil

List("a", "b") :: List("c", "d")

val thrill = "Will" :: "fill" :: "until" :: Nil

println(thrill(2))

println(thrill.count( s => s.length == 4))

println(thrill.drop(2))

println(thrill.dropRight(2))

println(thrill.exists(s => s =="until"))

println(thrill.filter(s => s.length == 4))

println(thrill.forall(s => s.endsWith("1")))

thrill.foreach(s => print(s))

println(thrill.head)

println(thrill.last)

println(thrill.isEmpty)

println(thrill.map(s => s + "y"))

println(thrill.mkString(", "))

println(thrill.filterNot(s => s.length == 4))

println(thrill.reverse)

println(thrill.sortWith ( (s,t) => s.charAt(0).toLower < t.charAt(0).toLower) )










