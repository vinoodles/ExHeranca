fun main(args: Array<String>) {

    var furtado = Employee("Furtado", 40, 5, 220, 30, 1000.0)
    var PoucasTrancas = Employee("PoucasTrancas", 40, 5, 220, 30, 1000.0)
    var QuaseNada = Employee("QuaseNada", 40, 5, 220, 30, 1000.0)

    furtado.tempoAposentadoria()
    furtado.tempoRestanteFerias()
    furtado.calculoBonus()


    //Sales
    var fritado = SalesRep("Furtado", 40, 5, 220, 30, 1000.0,200.0)
    var grelhado = SalesRep("grelhado", 40, 5, 220, 30, 1000.0,200.0)
    var clivado = SalesRep("clivado", 40, 5, 220, 30, 1000.0,200.0)

    fritado.calcularComissao()
    grelhado.calcularComissao()
    clivado.calcularComissao()

    //Salesmanager

    var filetar = SalesManager("filetar", 40, 5, 220, 30, 1000.0,200.0, 6000.0)
    var Fritar = SalesManager("filetar", 40, 5, 220, 30, 1000.0,200.0, 6000.0)
    var Pure = SalesManager("filetar", 40, 5, 220, 30, 1000.0,200.0, 6000.0)

    filetar.calcularComissaoGerente()
    filetar.addRepVendas()

}