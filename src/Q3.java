/*
3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
 */

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

class Faturamento {
    int dia;
    double valor;
}

public class Q3 {
    public static void main(String[] args) {
        List<Faturamento> faturamentoList = null;
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;
        int diasAcimaDaMedia = 0;

        try(FileReader reader = new FileReader("faturamento.json")) {
            Gson gson = new Gson();
            Type faturamentoListType = new TypeToken<List<Faturamento>>() {}.getType();
            faturamentoList = gson.fromJson(reader, faturamentoListType);

            for (Faturamento faturamento : faturamentoList) {
                if(faturamento.valor > 0) {
                    somaFaturamento += faturamento.valor;
                    diasComFaturamento++;

                    if(faturamento.valor < menorFaturamento) {
                        menorFaturamento = faturamento.valor;
                    }else if(faturamento.valor > maiorFaturamento) {
                        maiorFaturamento = faturamento.valor;
                    }
                }
            }

            double mediaMensal = somaFaturamento / diasComFaturamento;

            for(Faturamento faturamento : faturamentoList) {
                if(faturamento.valor > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.printf("Menor faturamento: R$ %.2f\n", menorFaturamento);
            System.out.printf("Maior faturamento: R$ %.2f\n", maiorFaturamento);
            System.out.printf("Média mensal: R$ %.2f\n", mediaMensal);
            System.out.printf("Número de dias com faturamento acima da média: %d\n", diasAcimaDaMedia);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
