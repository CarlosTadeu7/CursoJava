package JavaCursoIntroduçãoParte;

public class Aula8EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double impostoFaixa1 = 9.70 / 100;
        double impostoFaixa2 = 37.35 / 100;
        double impostoFaixa3 = 49.50/ 100;
        if (salarioAnual<= 34712){
            salarioAnual = salarioAnual * impostoFaixa1;
        } else if (salarioAnual >= 34712 && salarioAnual <= 68507) {
            salarioAnual= salarioAnual * impostoFaixa2;
        }else{
            salarioAnual = salarioAnual * impostoFaixa3;
        }
        System.out.println(salarioAnual);
    }
}
