package JavaCursoIntrodução;

public class Aula21ArrayMultidimensionais {
    public static void main(String[] args) {
       // Messes 1,2,3,4,5,6,7,8,9,10,11,12
       // Dias 31,28,31,30,31,30,31,31,30,31,30,31
        int[][] dias = new int[1][12];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;
        dias[0][3] = 31;
        dias[0][4] = 28;
        dias[0][5] = 31;
        dias[0][6] = 31;
        dias[0][7] = 31;
        dias[0][8] = 30;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length ; j++) {
                System.out.println(dias[i][j]);
            }

        }
        System.out.println("--------------------------------------");

        for (int[] arrBase: dias){
            for ( int num: arrBase ){
                System.out.println(num);
            }
        }

    }
}

