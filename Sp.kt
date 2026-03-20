//Foi feita uma pesquisa em cidades do estado de São Paulo para coletar dados sobre acidentes de transito.
// Faça um programa que receba os seguintes dados: Código da cidade, número de veiculos e número de acidentes com
// vitimas. para finalizar o programa digite 0 no codigo da cidade. Exiba os dados:
//Qual o maior indice de acidentes e qual a cidade (codigo da cidade)
//Qual a media de acidentes de transito
//Qual a media de veiculos nas cidades

fun main() {

    var codigo: Int
    var veiculos: Int
    var acidentes: Int

    var maiorIndice = 0
    var cidadeMaior = 0

    var somaAcidentes = 0
    var somaVeiculos = 0
    var totalCidades = 0

    println("Digite o código da cidade (0 para finalizar):")
    codigo = readln().toInt()

    while (codigo != 0) {

        print("Número de veículos: ")
        veiculos = readln().toInt()

        print("Número de acidentes com vítimas: ")
        acidentes = readln().toInt()

        if (acidentes > maiorIndice) {
            maiorIndice = acidentes
            cidadeMaior = codigo
        }

        somaAcidentes += acidentes
        somaVeiculos += veiculos
        totalCidades++

        println("Digite o código da próxima cidade (0 para finalizar):")
        codigo = readln().toInt()
    }

    if (totalCidades > 0) {

        val mediaAcidentes = somaAcidentes.toDouble() / totalCidades
        val mediaVeiculos = somaVeiculos.toDouble() / totalCidades

        println("Maior índice de acidentes: $maiorIndice")
        println("Cidade com maior índice: $cidadeMaior")
        println("Média de acidentes: $mediaAcidentes")
        println("Média de veículos: $mediaVeiculos")

    } else {
        println("Nenhuma cidade cadastrada.")
    }
}