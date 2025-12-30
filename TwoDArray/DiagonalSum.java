package TwoDArray;

public class DiagonalSum {
    public static int Sum(int matrix[][]) {
        // int add = 0;
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (j == i) {
        // add = add + matrix[i][j];

        // }else if(i+j ==matrix.length-1){
        // add += matrix[i][j];
        // }
        // }
        // }

        int add = 0;
        for (int i = 0; i < matrix.length; i++) {
            add += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                add += matrix[i][matrix.length - 1 - i];
            }
        }
        return add;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 4, 5, 6, 7 },
                { 5, 6, 7, 8 },
                { 1, 3, 6, 9 } };

        System.out.println(Sum(matrix));
    }
}
