package JavaCursoIntrodução;

public class Aula12EstruturasDeRepetição {
    public static void main(String[] args) {
        // Estruturas de repetição while, do while, for
        int count = 12;
        while (count <= 10) {
            System.out.println( count);
            count = count + 1;
        }
        count =0;
        do {
            System.out.println(" Dentro do while"+ ++count);

        }while (count <= 10);


        for (int i=0; i <10; i++ ){
            System.out.println("For" + i);

        }
    }
}
