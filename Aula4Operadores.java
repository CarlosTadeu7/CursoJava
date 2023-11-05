package JavaCursoIntrodução;

public class Aula4Operadores {
    public static void main(String[] args) {
        // Operadores basicos + - / *
        int number01 = 10;
        double number02 = 20;
        double result = number01 / number02;
        System.out.println(result);

        // Operador de divisão %
        int rest = 21 % 2;
        System.out.println(rest);

        // Operadores logicos < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezDiferenteDeVinte " + isDezDiferenteDeVinte);
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);

        // Operadores && = (And) || = (or) !

        int age = 29;
        float wage = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age >= 30 && wage >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && wage >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double ValoprTotalContaCorrente = 200;
        double ValoprTotalContaPoupança = 10000;
        float ValorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = ValoprTotalContaCorrente > ValorPlaystation || ValoprTotalContaPoupança > ValorPlaystation;
        System.out.println( "isPlaystationCincoCompravel "+isPlaystationCincoCompravel );

        // Operadores de atribuição aritimericos = += -= *= %= /=

        double Bonus = 1800;
        Bonus += 1000;
        Bonus -= 1000;
        Bonus *= 2;
        Bonus /= 2;
        Bonus %= 2;
        System.out.println(Bonus);

        // operadores unáros -- ++
        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        System.out.println(contador);


    }
}
