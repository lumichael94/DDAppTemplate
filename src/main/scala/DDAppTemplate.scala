import org.apache.spark._
import com.datastax.spark.connector._

/** Read from cassandra to make sure things are working.
  * Assumes test.hello table already exists and has data, see cassandra-example.cql
  */
object DDAppTemplate {
  def main(args: Array[String]): Unit = {
    // only setting app name, all other properties will be specified at runtime for flexibility
    val conf = new SparkConf().setAppName("DDAppTemplate")

    val sc = new SparkContext(conf)

    val hello = sc.cassandraTable[(String, String)]("test", "hello")

    val first = hello.first

    sc.stop

    println(first)
  }
}
