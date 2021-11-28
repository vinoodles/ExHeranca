fun main(args: Array<String>) {

    var num: Int = 0
    var acm: Int = 0
    var cont: Int = 0
    var menor: Int = 100000000
    var maior: Int = 0
    var media: Double

    do {
        println("Por favor, informe um numero diferente de 0: ")
        num = readLine()!!.toInt()

        acm += num
        cont++
        if (num < menor && num != 0 )
        {
            menor = num
        }
        if (num > maior)
        {
            maior = num
        }
    }
    while(num != 0)

    media = acm.toDouble() / cont

    println("A soma de todos numeros digitados é de $acm, a media dos numeros é de $media" +
            "O menor numero informado foi $menor e o maior numero informado foi $maior")

}