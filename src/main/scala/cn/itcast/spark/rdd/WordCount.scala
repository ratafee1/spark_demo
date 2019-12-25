package cn.itcast.spark.rdd

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
import org.junit.Test

class WordCount {
//  def main(args: Array[String]): Unit = {
//    val conf = new SparkConf().setMaster("local[2]").setAppName("word_count")
//    //    创建sparkcontext
//    val sc = new SparkContext(conf)
//    //  加载文件
//    //    rdd是数据集 是编程模型 有依赖关系
//    val rdd1: RDD[String] = sc.textFile("dataset/wordcount.txt")
//    //    处理
//    val rdd2 = rdd1.flatMap(item => item.split(" "))
//    //    把整句话拆分为多个单词
//    val rdd3 = rdd2.map(item => (item, 1))
//    val rdd4 = rdd3.reduceByKey((curr, agg) => curr + agg)
//
//    val result = rdd4.collect()
//    result.foreach(item => println(item))
//
//  }

  @Test
  def sparkContext() = {



    val conf = new SparkConf().setMaster("local[2]").setAppName("spark_context")
    val sc = new SparkContext(conf)
    //          sparkcontext入口api，能够创建rdd，设置参数，设置jar包
  }

  //  本地集合创建
  //  rdd传递
  // hdfs 或本地文件系统创建

  val conf = new SparkConf().setMaster("local[2]").setAppName("spark_context")
  val sc = new SparkContext(conf)

  @Test
    def mapTest(): Unit = {
      // 1. 创建 RDD
      val rdd1 = sc.parallelize(Seq(1, 2, 3))
      // 2. 执行 map 操作
      val rdd2 = rdd1.map(item => item * 10)
      // 3. 得到结果
      val result: Array[Int] = rdd2.collect()
      result.foreach(item => println(item))
    }



}