package com.example.zvexample

fun main() {
    println("Hello world")

    val namesList = listOf<String>("Aram", "Artur", "Karen", "Ani")
    namesList.forEach { name ->
        print("$name ")
    }
    val surNameList = listOf<String>(
        "Musayelyan", "Aramyan",
        "Sirunyan", "Gkhukasyan"
    )

    surNameList.forEachIndexed { index, surname ->
        if (index == 0) {
            println()
        }
        print("$surname ")
    }
}