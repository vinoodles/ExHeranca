import kotlin.math.min

open class Employee (var primeiroNome: String, var idade: Int, var anosTrabalhados: Int, var diasTrabalhados: Int, var diasDeFerias: Int, var salario: Double){

    var ultimoNome: String = ""
    var registro: Int = 0
    var anosParaAposentar: Int = 0
    var tempoRestanteFerias: Double = 0.0
    var bonus: Double = 0.0

    fun tempoAposentadoria(): Int
    {
        anosParaAposentar = min(60 - idade, 40 - anosTrabalhados )
        println("Faltam um total de $anosParaAposentar anos para a sua aposentadoria")
        return 0
    }

    fun tempoRestanteFerias(): Int
    {
        tempoRestanteFerias = (diasTrabalhados.toDouble() / 360) * (30 - diasDeFerias)
        println("Ainda faltam um total de $tempoRestanteFerias para entrar de férias")
        return 0
    }

    fun calculoBonus(): Int
    {
        bonus = 2.2 * salario
        println("Você irá receber $bonus de bonus")
        return  0
    }

}