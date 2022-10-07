package ru.netology

fun main (){
    val likes = 9_000_000_041

    if ( likes % 1000 == 0L) {
        println("Понравилось $likes людей")
    } else if (((likes.toDouble()/10 - likes/10) * 10).toInt() == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}
