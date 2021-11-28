fun main(args: Array<String>) {

    var cont: Int = 0
    var acm: Int = 0
    var media: Int

    while(cont < 4)
    {
        cont++
        println("Informe as suas notas do Bimestre: ")
        acm += readLine()!!.toInt()
    }

    media = acm / 4
    println("A media das notas informadas é de $media")
}