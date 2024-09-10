package com.example.a2lekcja

fun main(){
    print("wpisz cos:")
    val input = readln()!!
    when (input) {
        "pomidor" -> println("pomidor")
        "truskawka" -> println("truskawka")
            else -> println("ani truskawka,ani pomidor")
    }
}