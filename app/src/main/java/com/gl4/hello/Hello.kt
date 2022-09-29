package com.gl4.hello

fun main(argv : Array<String> ){
    print("Hello")

    //val hello = "Hello"
    var hello = "Hello"
    hello = "Hello world!"

    println(hello)

    //var toto:Int = "Toto"
    var toto:String = "Toto"

    println(toto)

    var message: String? = "I’m learning Kotlin!"
    message = null
    println(message.toString())

    fun sum(a:Int,b:Int):Int {
        return a+b;
    }

    fun sayMyName(name:String) { println(" $name ") }

    fun sayHello(): String = "Hello"



}