package com.github.serofax.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
  testRunFunction()
}

private fun testRunFunction() {
  // Start a coroutine
  repeat(10000){i->
    GlobalScope.launch {
      println("In start $i: ${Thread.currentThread().name}")
      delay(200)
//      Thread.sleep(200)
      println("In ended $i: ${Thread.currentThread().name}")
    }
  }
  run {
    println("Out start: ${Thread.currentThread().name}")
    Thread.sleep(300)
//    Thread.sleep(30000)
    println("Out ended: ${Thread.currentThread().name}")
  }
}
