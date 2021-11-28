fun main(args: Array<String>) {

    println("Digite um numero de 1 a 10: ")
    var num: Int = readLine()!!.toInt()

    for(i in 10 downTo 1) {
        println("$i X $num = ${ i * num }")
    }

}