package JavaCursoIntrodução;

public class Aula8EstruturasCondicionaisExercicios {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double impostoFaixa1 = 9.70 / 100;
        double impostoFaixa2 = 37.35 / 100;
        double impostoFaixa3 = 49.50/ 100;
        double valorDoImposto;
        if (salarioAnual<= 34712){
            valorDoImposto = salarioAnual * impostoFaixa1;
        } else if (salarioAnual >= 34712 && salarioAnual <= 68507) {
           valorDoImposto= salarioAnual * impostoFaixa2;
        }else{
           valorDoImposto = salarioAnual * impostoFaixa3;
        }
        System.out.println(valorDoImposto);
    }
}
