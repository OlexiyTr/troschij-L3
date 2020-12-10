package com.example.exework

fun main(){
    val list = listOf(1,2,4,4,4,4,5,5,5,5,5,5,5,5,6,7)
    val map = list.groupingBy { it }.eachCount()
    println(map.maxBy { it.value })
}