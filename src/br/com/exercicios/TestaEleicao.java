package br.com.exercicios;

public class TestaEleicao {

    public static void main(String[] args) {
        Eleicao eleicao = new Eleicao(1000, 800, 150, 50);

        System.out.printf("Percentual de votos válidos: %.2f%%\n", eleicao.calcularPercentualVotosValidos());
        System.out.printf("Percentual de votos em branco: %.2f%%\n", eleicao.calcularPercentualVotosBrancos());
        System.out.printf("Percentual de votos nulos: %.2f%%\n", eleicao.calcularPercentualVotosNulos());
    }

}
