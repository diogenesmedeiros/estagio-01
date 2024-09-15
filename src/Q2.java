/*
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente
definido no código;
 */

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        int num = 10;
        ArrayList<Integer> fibonacci = new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);

        for(int i = 2; i < num; i++) {
            fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
        }

        System.out.println(fibonacci);
    }
}
