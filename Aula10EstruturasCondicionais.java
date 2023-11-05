package JavaCursoIntrodução;

public class Aula10EstruturasCondicionais {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo.
        byte dia = 0;
        // Variaveis do switch, char, int, byte, enum, String.
        switch (dia){
            case 1:
                System.out.println("Domingo"); break;
            case 2:
                System.out.println("Segunda"); break;
            case 3:
                System.out.println("Terça"); break;
            case 4:
                System.out.println("Quarta"); break;
            case 5:
                System.out.println("Quinta"); break;
            case 6:
                System.out.println("sexta"); break;
            case 7:
                System.out.println("Sábado");
            default:
                System.out.println("Dia da semana inexistente"); break;

        }
        char sexo = 'M';
        switch (sexo){
            case'M':
                System.out.println("Homen"); break;
            case 'F':
                System.out.println("Mulher"); break;
            default:
                System.out.println("Opção inválida"); break;
        }
    }
}
