val tuple = ('u', 'r', "the", 1,4,"me");
val array = Array[String]("Penelope", "Rose", "Dawson")

tuple.productIterator.foreach(println);
assert(array.sameElements(Array[String]("Penelope","Rose", "Dawson")))



