package aula

import javax.swing.JOptionPane

object Exemplo {

    fun somar(x: Int, y: Int): Int {
        return x + y
    }

    fun subtrair(x: Int, y: Int): Int {
        return x - y
    }

    fun multiplicar(x: Int, y: Int): Int {
        return x * y
    }

    fun divisao(x: Int, y: Int): Int {
        return x / y
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "))
        val b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "))
        JOptionPane.showMessageDialog(null, "Total Soma: " + somar(a, b) + "\nTotal Subtração: " + subtrair(a, b) + "\nTotal Multiplicação: " + multiplicar(a, b) + "\nTotal Divisão: " + divisao(a, b))
    }
}
