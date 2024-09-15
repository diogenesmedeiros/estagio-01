/*
4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
• SP – R$67.836,43
• RJ – R$36.678,66
• MG – R$29.229,88
• ES – R$27.165,48
• Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do
valor total mensal da distribuidora.
*/

public class Q4 {
    public static void main(String[] args) {
        double faturamentoMensalSP = 67836.43;
        double faturamentoMensalRJ = 36678.66;
        double faturamentoMensalMG = 29229.88;
        double faturamentoMensalES = 27165.48;
        double faturamentoMensalOutros = 19849.53;

        double valorTotalMensal = faturamentoMensalSP + faturamentoMensalRJ + faturamentoMensalMG + faturamentoMensalES + faturamentoMensalOutros;

        double percentualSP = (faturamentoMensalSP / valorTotalMensal) * 100;
        double percentualRJ = (faturamentoMensalRJ / valorTotalMensal) * 100;
        double percentualMG = (faturamentoMensalMG / valorTotalMensal) * 100;
        double percentualES = (faturamentoMensalES / valorTotalMensal) * 100;
        double percentualOutros = (faturamentoMensalOutros / valorTotalMensal) * 100;

        System.out.printf("Valor total mensal da distribuidora: R$ %.2f\n" +
                "Percentual SP: %.2f%%\n" +
                "Percentual RJ: %.2f%%\n" +
                "Percentual MG: %.2f%%\n" +
                "Percentual ES: %.2f%%\n" +
                "Percentual dos outros: %.2f%%\n", valorTotalMensal, percentualSP, percentualRJ, percentualMG, percentualES, percentualOutros);
    }
}
