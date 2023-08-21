fun main () {
    for (i in 1..5 step 2){
        println(i)
   }
    println("UNTIL")
    for (i in 1 until 5){
        println(i)
    }
    for (i in 10 downTo 1){
        println(i)
    }

    val number = 2
    for (i in 1.. 10){
        println(number.toString() + "x" + i + "=" + (number * i))
        println("$number x $i = ${number * i}")
    }
    }
fun main  (){
    val result = add(4 , 5)
        println(result)
val result2 = add(5, 6)
        println(result2)
        evenorodd(15)
        evenorodd(20)
}
        fun add (num1 : Int, num2: Int): Int
        {
            val sum = num1 + num2
            return sum
        }
fun evenorodd (num1: Int){
    val result = if (num1 %2 ==0)"Even" else "Odd"
    println(result)
}