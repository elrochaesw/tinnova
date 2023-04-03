package br.com.exercicios;

/**
 * Classe que realiza a soma dos múltiplos.
 * @author Evandro Rocha.
 * @email evandro.esw@gmail.com
 */
public class SomaMultiplos {

    int limite = 0;

    public SomaMultiplos(int limite){
        this.limite = limite;
    };

    /**
     * Método de soma dos múltiplos.
     * Você deve utiliza-lo realizar a soma.
     * @param limite limite das somas.
     * @author Evandro Rocha.
     */
    public static int somaMultiplos(int limite) {
        int soma = 0;

        //Execução das somas.
        for (int i = 1; i < limite; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
