fun main(args: Array<String>) {

    var num: Int
    var cont: Int = 0
    var par: Int = 0
    var impar: Int = 0

    while (cont < 10) {
        println("Informe um numero para ser verificado: ")
        num = readLine()!!.toInt()
        cont++

        if (num % 2 != 0) {
            impar++
        } else {
            par++
        }
    }

    println("A quantidade de numeros impares informada é de $impar e a quantidade de numeros pares é de $par")
}