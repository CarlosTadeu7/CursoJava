package JavaCursoIntrodução;

public class Aula5EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 35;
        boolean isAutorizadoCompraBebida = idade >= 18;
        if (isAutorizadoCompraBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
            System.out.println(" Beba com moderação");
         // Else e o mesmo que o operador de negação a diferença que e interligado ao codigo.
        }else{
            System.out.println(" Não autorizador");
        }

        // Operador de negação !
        if (! isAutorizadoCompraBebida)
        System.out.println("Não Autorizado a comprar bebida alcólica");

    }
}
