//Faça um programa que recebe varios numeros e ao final informe quantos desses numeros estavam entre 100 e 200. Finalize o
// programa ao digitar 0


fun main() {

    var numero: Int
    var contador = 0

    println("Digite números (0 para sair):")

    do {

        numero = readln().toInt()

        if (numero in 100..200) {
            contador++
        }

    } while (numero != 0)

    println("Quantidade de números entre 100 e 200: $contador")
}