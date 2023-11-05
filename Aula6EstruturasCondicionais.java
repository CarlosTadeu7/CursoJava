package JavaCursoIntrodução;

public class Aula6EstruturasCondicionais {
    public static void main(String[] args) {
        // if idade < 15 categoria infantil
        // if idade >= 15 && idade < 18 categoria juvenil
        // if idade >= 18 categoria adulto
        int idade = 16;
        String Categoria;
        if (idade < 15 ){
            Categoria = " Categoria infantil";
        } else if ( idade >= 15 && idade < 18) {
            Categoria =" Categoria juvenil";
        }else{
            Categoria = " Categoria adulto";
        }
        System.out.println(Categoria);
    }
}
