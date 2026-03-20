// Escreva um programa que receba valores inteiros, ele vai encerrar ao receber o numero 0, ao final escreva
// na tela o menor e o maior valor digitado, lembre-se de não considerar o 0 digitado para sair, senão o menor valor
// será sempre 0.

fun main() {

    var numero: Int
    var maior = Int.MIN_VALUE
    var menor = Int.MAX_VALUE

    println("Digite números inteiros (0 para sair):")

    do {
        numero = readln().toInt()

        if (numero != 0) {

            if (numero > maior) {
                maior = numero
            }

            if (numero < menor) {
                menor = numero
            }

        }

    } while (numero != 0)

    println("Maior número: $maior")
    println("Menor número: $menor")
}