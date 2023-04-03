package br.com.exercicios;

/**
 * Classe que testa a classe Fatorial.
 * @author Evandro Rocha.
 * @email evandro.esw@gmail.com
 */
public class TestaFatorial {

    public static void main(String[] args) {
        // Instância da classe Fatorial.
        Fatorial fatorial = new Fatorial();

        // Número para o cálculo fatorial.
        int numero = 5;

        // Chamada do método que realiza o cálculo e atribuição da variável resultado.
        long resultado = fatorial.calculaFatorial(numero);

        // Saída da execução da classe.
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
