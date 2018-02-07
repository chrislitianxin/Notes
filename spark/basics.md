Scala
=====
* Scala is OOP and a compiler based language. Python is interpreted language, as compared scala should be faster. Everything in scala is an object and any operations you perform is a method call. 
 * Easy to interact with Java, can write Java inside Scala class
 * Scala is also functional lang, every computation is a math function (not pure functional as opposed to Haskell)

Terms
-----
* Object: An entity that has state and behavior is known as an object. For example: table, person, car etc.

* Class: A class can be defined as a blueprint or a template for creating different objects which defines its properties and behavior.

* Method: It is a behavior of a class. A class can contain one or more than one method. For example: deposit can be considered a method of bank class.

* Closure: Closure is any function that closes over the environment in which it’s defined. A closure returns value depends on the value of one or more variables which is declared outside this closure.

* Traits: Traits are used to define object types by specifying the signature of the supported methods. It is like interface in java.

basics
----

variables
```scala
var Var1 : string = "blablabla" // mutable. you can also write: var Var1 = "blablabla"
val Var2 : string = "blablabla" // immutable
```
assignment
```scala
var Var1 = 4
```

if else 
```scala
if (Var1 = 4) {
    println("True")
} else {
    println("False")
}
```

for loop
```scala
for( i <- 1 to 10) {
    println("do something" + i)
}
```

function
```scala
def functionName ([list of parameters]) : [return type] = {
   function body
   return [expr]
}
// eg
def foo(m: Int): Int = m*10
```

array 
```scala
var name = Array("Faizan","Swati","Kavya", "Deepak", "Deepak")
// Output:
// name: Array[String] = Array(Faizan, Swati, Kavya, Deepak, Deepak)
var name:Array[String] = new Array[String](3)
// or
var name = new Array[String](3)
// Output:
// name: Array[String] = Array(null, null, null)
// assign
name(1) = "blablabla"
```

list & multi-dimensional list: similar to racket
```scala
val number1 = List( List(1, 0, 0), List(0, 1, 0), List(0, 0, 1) )
// number1: List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
```

object 
```scala
object HelloWorld {
    def main(args: Array[String]) {
        println("Hello, world!")
    }
 }

 scalac HelloWorld.scala // compile 
 scala HelloWorld // run
```


