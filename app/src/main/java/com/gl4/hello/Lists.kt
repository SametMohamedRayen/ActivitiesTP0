package com.gl4.hello

private val languages = listOf("Java","Kotlin","Dart") // Créez une liste ordonnée de plusieurs languages de programation

fun main(args: Array<String>) {
    fun showList(list: List<String>){
        // Complétez la fonction pour afficher les éléments de la liste
        for (l in list){
            print("$l|")
        }
        println()
    }

    fun oddNumbersTo10(){
        // Complétez la fonction pour afficher les nombres impairs jusqu'à 10
        for(i in 1..10 step 2){
            println(i)
        }
    }
    println("Languages :")
    showList(languages)
    println("Odd Numbers to 10 :")
    oddNumbersTo10()
}