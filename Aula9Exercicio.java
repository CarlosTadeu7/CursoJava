package JavaCursoIntrodução;

public class Aula9Exercicio {
    public static void main(String[] args) {
        // até R$ 2.112 reais – 0,0%
        //entre R$ 2.112,01 e R$ 2.826,65 – 7,50%
        //entre R$ 2.826,66 e R$ 3.751,05 – 15,00%
        //entre R$ 3.751,06 e R$ 4.664,68 – 22,50%
        //acima de R$ 4.664,68 – 27,50%
        double salarioAnual = 10000;
        double impostoFaixa1 = 0 / 100;
        double impostoFaixa2 = 7.50 / 100;
        double impostoFaixa3 = 15.00 / 100;
        double impostoFaixa4 = 22.50 / 100;
        double impostoFaixa5 = 27.50 / 100;
        double valorDoImposto;
        if (salarioAnual <= 2112) {
            valorDoImposto = salarioAnual * impostoFaixa1;
        } else if (salarioAnual > 2112 && salarioAnual <= 2826) {
            valorDoImposto = salarioAnual * impostoFaixa2;
        } else if (salarioAnual > 2826 && salarioAnual <= 3751) {
            valorDoImposto = salarioAnual * impostoFaixa3;
        } else if (salarioAnual > 2826 && salarioAnual <= 3751) {
            valorDoImposto = salarioAnual * impostoFaixa4;
        } else{
            valorDoImposto = salarioAnual * impostoFaixa5;
        }
        System.out.println(valorDoImposto);

    }
}
