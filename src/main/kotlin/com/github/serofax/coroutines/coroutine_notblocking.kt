package com.github.serofax.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
  testRunFunction()
}

private fun testRunFunction() {
  // Start a coroutine
  GlobalScope.launch {
    println("In start : ${Thread.currentThread().name}")
    delay(200)
    println("In ended : ${Thread.currentThread().name}")
  }
  GlobalScope.launch {
    println("In start 2 : ${Thread.currentThread().name}")
    delay(200)
    println("In ended 2: ${Thread.currentThread().name}")
  }
  GlobalScope.launch {
    println("In start 3 : ${Thread.currentThread().name}")
    delay(200)
    println("In ended 3: ${Thread.currentThread().name}")
  }

  run {
    println("Out start: ${Thread.currentThread().name}")
    Thread.sleep(300)
    println("Out ended: ${Thread.currentThread().name}")
  }
}
