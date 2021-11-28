class SalesManager (primeiroNome: String, idade: Int, anosTrabalhados: Int, diasTrabalhados: Int, diasDeFerias: Int,
                    salario: Double, vendasFeitas: Double, var totalVendas: Double ):
    SalesRep(primeiroNome, idade, anosTrabalhados, diasTrabalhados, diasDeFerias, salario, vendasFeitas )
{

    val vendasTime = HashMap<Int, SalesRep>()
    var comissaoGestor: Double = 0.0
    var numVendas = 0.0

    fun addRepVendas (repVendas: SalesRep)
    {
        vendasTime.put(repVendas.registro, repVendas)

    }

    fun calcularComissaoGerente()
    {
        if (vendasTime.isEmpty())
        {
            println("Não há representantes de vendas")
        }
        else
        {
            for (item in vendasTime)
            {
                numVendas += item.value.vendasFeitas
            }

            comissaoGestor = 0.03 * numVendas

            println("A comissão geral com é de $comissaoGestor")
        }
    }

}