/*
5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
 */

public class Q5 {
    public static String reverse(String palavra) {
        char[] caracteres = new char[palavra.length()];
        String palavraReverse = "";

        int index = 0;
        for (char letra : palavra.toCharArray()) {
            caracteres[index] = letra;
            index++;
        }

        for (int i = caracteres.length - 1; i >= 0; i--) {
            char letra = caracteres [i];
            palavraReverse += letra;
        }

        return palavraReverse;
    }

    public static void main(String[] main) {
        String palavra = "Guts";

        System.out.println(reverse(palavra));
    }
}