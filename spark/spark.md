Spark Terms
===========
* Lazy operation: Operations which do not execute until we require results.
* Spark Context:  holds a connection with Spark cluster manager.
* Driver and Worker: A driver is in charge of the process of running the main() function of an application and creating the SparkContext.
* In-memory computation: Keeping the data in RAM instead of Hard Disk for fast processing.
* RDD: RDD (Resilient Distributed Database) is a collection of elements, that can be divided across multiple nodes in a cluster for parallel processing. It is also fault tolerant collection of elements, which means it can automatically recover from failures. RDD is immutable, we can create RDD once but can’t change it.
* Dataset: It is also a distributed collection of data. A Dataset can be constructed from JVM objects and then manipulated using functional transformations (map, flatMap, filter, etc.). As I have already discussed in my previous articles, dataset API is only available in Scala and Java. It is not available in Python and R.
* DataFrame: In Spark, a DataFrame is a distributed collection of data organized into named columns. It is conceptually equivalent to a table in a relational database or a data frame. It is mostly used for structured data processing. In Scala, a DataFrame is represented by a Dataset of Rows. A DataFrame can be constructed by wide range of arrays for example, existing RDDs, Hive tables, database tables.
* Transformation: Transformation refers to the operation applied on a RDD to create new RDD.
* Action: Actions refer to an operation which also apply on RDD that perform computation and send the result back to driver.
* Broadcast: We can use the Broadcast variable to save the copy of data across all node.
* Accumulator: In Accumulator, variables are used for aggregating the information.


Creating RDD
`./bin/spark-shell` 
```scala
val data = Array(1,2 ,3)
val distData = sc.parallelize(data)  // create RDD from iterable
disData.collect()   // see the data
```

Map 
```scala
var lines = sc.textFile("text.txt") // load data from another file
val Length = lines.map(s => s.length)
Length.collect()
lines.count() 
```

Reduce 
```scala
val totalLength = Length.reduce((a,b) => a+b)   // calculate the total length of all lines in Length
```

FlatMap transformation and reduce by key action
```scala
val counts = lines.flatMap(line => line.split(" ")).map(word => word,1__.reduceByKey(_+_) 
// calculate frequency of each word
```

Filter Transformation
```scala
// filter out the words with length more than 5
val lg5 = lines.flatMap(line => line.split(" ")).filter(_.length > 5)
