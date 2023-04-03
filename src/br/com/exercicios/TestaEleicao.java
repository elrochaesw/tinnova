package br.com.exercicios;

/**
 * Classe que testa a classe Eleicao.
 * @author Evandro Rocha.
 * @email evandro.esw@gmail.com
 */
public class TestaEleicao {

    public static void main(String[] args) {
        // Instância da classe Eleicao.
        Eleicao eleicao = new Eleicao(1000, 800, 150, 50);

        // Saída da execução dos métodos da classe Eleicao.
        System.out.println("Percentual de votos válidos: " + eleicao.calcularPercentualVotosValidos() + "%");
        System.out.println("Percentual de votos em branco: " + eleicao.calcularPercentualVotosBrancos() + "%");
        System.out.println("Percentual de votos nulos: " + eleicao.calcularPercentualVotosNulos() + "%");
    }

}
