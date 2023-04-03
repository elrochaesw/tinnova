package br.com.exercicios;

/**
 * Classe que realiza a soma dos múltiplos.
 * @author Evandro Rocha.
 * @email evandro.esw@gmail.com
 */
public class Eleicao {

    private int totalEleitores;
    private int votosValidos;
    private int votosBrancos;
    private int votosNulos;

    /**
     * Método construtor.
     * Você deve utilizá-lo criar o objeto eleicao.
     * @param totalEleitores número inteiro totalizando os eleitores.
     * @param votosValidos inúmero inteiro totalizando os votos válidos.
     * @param votosBrancos número inteiro totalizando os votos em branco.
     * @param votosNulos número inteiro totalizando os votos nulos.
     * @author Evandro Rocha.
     */
    public Eleicao(int totalEleitores, int votosValidos, int votosBrancos, int votosNulos) {
        this.totalEleitores = totalEleitores;
        this.votosValidos = votosValidos;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
    }

    /**
     * Método para calcular o percentual de votos válidos.
     * Você deve utilizá-lo para calcular o percentual de votos válidos.
     * @author Evandro Rocha.
     */
    public double calcularPercentualVotosValidos() {
        return (double) votosValidos / totalEleitores * 100;
    }

    /**
     * Método para calcular o percentual de votos em branco.
     * Você deve utilizá-lo para calcular o percentual de votos em branco.
     * @author Evandro Rocha.
     */
    public double calcularPercentualVotosBrancos() {
        return (double) votosBrancos / totalEleitores * 100;
    }

    /**
     * Método para calcular o percentual de votos nulos.
     * Você deve utilizá-lo para calcular o percentual de votos nulos.
     * @author Evandro Rocha.
     */
    public double calcularPercentualVotosNulos() {
        return (double) votosNulos / totalEleitores * 100;
    }

}
