open class SalesRep (primeiroNome: String, idade: Int, anosTrabalhados: Int, diasTrabalhados: Int, diasDeFerias: Int, salario: Double,
                     var vendasFeitas: Double):
    Employee (primeiroNome, idade, anosTrabalhados, diasTrabalhados, diasDeFerias, salario) {

    var comissao: Double = 0.0

    fun calcularComissao(): Int
    {
        comissao = 0.1 * vendasFeitas
        println("Você irá receber $comissao de comissão")
        return 0
    }

}