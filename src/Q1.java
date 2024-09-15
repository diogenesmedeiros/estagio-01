/*
1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
Imprimir(SOMA);
 */

public class Q1 {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;

        while(K < INDICE) {
            K += 1;
            SOMA += K;
        }

        System.out.printf("O resultado foi %d", SOMA);
    }
}
