/* Scala is OOP and a compiler based language 
 * Python is interpreted language, as compared scala should be faster.
 * Everything in scala is an object and any operations you perform is a method call. 
 * Easy to interact with Java, can write Java inside Scala class
 * Scala is also functional lang, every computation is a math function 
 *  (not pure functional as opposed to Haskell)
 */

/*

Object: An entity that has state and behavior is known as an object. For example: table, person, car etc.

Class: A class can be defined as a blueprint or a template for creating different objects which defines its properties and behavior.

Method: It is a behavior of a class. A class can contain one or more than one method. For example: deposit can be considered a method of bank class.

Closure: Closure is any function that closes over the environment in which it’s defined. A closure returns value depends on the value of one or more variables which is declared outside this closure.

Traits: Traits are used to define object types by specifying the signature of the supported methods. It is like interface in java.

*/


// variables
var Var1 : string = "blablabla" // mutable. you can also write: var Var1 = "blablabla"
val Var2 : string = "blablabla" // immutable

// assignment
var Var1 = 4

// if else 
if (Var1 = 4) {
    println("True")
} else {
    println("False")
}

// for loop
for( i <- 1 to 10) {
    println("do something" + i)
}

// function
def functionName ([list of parameters]) : [return type] = {
   function body
   return [expr]
}
// eg
def foo(m: Int): Int = m*10

// array 
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

// list & multi-dimensional list: similar to racket
val number1 = List( List(1, 0, 0), List(0, 1, 0), List(0, 0, 1) )
// number1: List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))

// object 
object HelloWorld {
    def main(args: Array[String]) {
        println("Hello, world!")
    }
 }

 scalac HelloWorld.scala // compile 
 scala HelloWorld // run


// Sparks basic terminology 
/*
Lazy operation: Operations which do not execute until we require results.
Spark Context:  holds a connection with Spark cluster manager.
Driver and Worker: A driver is in charge of the process of running the main() function of an application and creating the SparkContext.
In-memory computation: Keeping the data in RAM instead of Hard Disk for fast processing.

RDD: RDD (Resilient Distributed Database) is a collection of elements, that can be divided across multiple nodes in a cluster for parallel processing. It is also fault tolerant collection of elements, which means it can automatically recover from failures. RDD is immutable, we can create RDD once but can’t change it.
Dataset: It is also a distributed collection of data. A Dataset can be constructed from JVM objects and then manipulated using functional transformations (map, flatMap, filter, etc.). As I have already discussed in my previous articles, dataset API is only available in Scala and Java. It is not available in Python and R.
DataFrame: In Spark, a DataFrame is a distributed collection of data organized into named columns. It is conceptually equivalent to a table in a relational database or a data frame. It is mostly used for structured data processing. In Scala, a DataFrame is represented by a Dataset of Rows. A DataFrame can be constructed by wide range of arrays for example, existing RDDs, Hive tables, database tables.
Transformation: Transformation refers to the operation applied on a RDD to create new RDD.
Action: Actions refer to an operation which also apply on RDD that perform computation and send the result back to driver.
Broadcast: We can use the Broadcast variable to save the copy of data across all node.
Accumulator: In Accumulator, variables are used for aggregating the information.
*/
