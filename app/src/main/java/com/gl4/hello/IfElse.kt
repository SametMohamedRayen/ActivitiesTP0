package com.gl4.hello

fun operation(op:String,in1:Int,in2:Int) : Int {
    when(op) {
        "+" -> return in1+in2
        "-"-> return in1-in2
        "*"-> return in1*in2
        "/"-> return in1/in2
        "%"-> return in1%in2
        else -> return(0)
    }
}