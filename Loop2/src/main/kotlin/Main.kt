fun main(args: Array<String>) {

    var num: Int
    var impar: Int = 0
    var par: Int = 0

    println("Informe 10 numeros a serem verificados: ")

    for (i in 1..10)
    {
        println("Informe outro numero: ")
        num = readLine()!!.toInt()

        if(num % 2 != 0)
        {
            impar++
        }
        else
        {
            par++
        }
    }

    println("Dos numeros informados $impar são impares e $par são pares")

}