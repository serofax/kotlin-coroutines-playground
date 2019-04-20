package com.github.serofax.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {
  testRunFunction()
}

private fun testRunFunction() {
  // Start a coroutine
  GlobalScope.launch {
    println("In start : ${Thread.currentThread().name}")
    Thread.sleep(200)
    println("In ended : ${Thread.currentThread().name}")
  }

  run {
    println("Out start: ${Thread.currentThread().name}")
    Thread.sleep(300)
    println("Out ended: ${Thread.currentThread().name}")
  }
}
