package figure;

public class MainArrays {
    public static void main(String[] args) {
        Integer[] array = new Integer[3];
        array[0] = 82;
        array[1] = 97;
        array[2] = 46;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Integer i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
        for(Integer num : array){
            System.out.println(num);
        }

        Integer matrix[][] = new Integer[4][];
        matrix[0] = new Integer[1];
        matrix[0][0] = 10;

        matrix[1] = new Integer[2];
        matrix[1][0] = 20;
        matrix[1][1] = 30;

        matrix[2] = new Integer[3];
        matrix[2][0] = 40;
        matrix[2][1] = 50;
        matrix[2][2] = 60;

        matrix[3] = new Integer[2];
        matrix[3][0] = 70;
        matrix[3][1] = 80;

        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[j].length; k++) {
                System.out.print(matrix[j][k] + "\t");
            }
            System.out.println();
        }
    }

}
