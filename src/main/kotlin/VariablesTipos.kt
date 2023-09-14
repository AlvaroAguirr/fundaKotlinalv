fun main(){
    //variables y tpos de datos kotlin
    // val para oncstantes
    // var para variables

    val name = "alvaro Aguirre "
    var age= 18


    println(" hola, soy  "+ name + "y tengo ")
    println("$age años")

    // las variables val no change y son (inmutables)
    age=19
    age+= 4
   // age ="" variables var cambian de valor y no de tipo

    // Declarar
    val city: String
    // inicializar
    city = "Terrenate"

    // decalracion e inicializacion

    val isMarried: Boolean = false

    val children:Int=0
    val heigth:Double = 1.70

    // String Templates
    // $ para imprimir valor de variables
    // ${} para procesos ante sd e imprimir

    println("hola sou $name y tengo $age años")
    println(" vivo en $city tengo $children hijos ")

    println(" en 2028 tendre ${children +1} hijos")


}