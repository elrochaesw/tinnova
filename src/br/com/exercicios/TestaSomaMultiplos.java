package br.com.exercicios;

/**
 * Classe que testa a classe SomaMultiplos.
 * @author Evandro Rocha.
 * @email evandro.esw@gmail.com
 */
public class TestaSomaMultiplos {

    public static void main(String[] args) {
        // Número limite
        int limite = 100;

        // Instância da classe SomaMultiplos.
        SomaMultiplos somaMultiplos = new SomaMultiplos(limite);

        // Chamada do método que realiza as somas e atribuição da variável soma.
        int soma = somaMultiplos.somaMultiplos(limite);

        // Saída da execução do método da classe SomaMultiplos.
        System.out.println("A soma dos números múltiplos de 3 ou 5 até " + limite + " é: " + soma);

    }

}
