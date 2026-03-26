package TwoDArrayPrac;

public class Transpose {
    public static void transpose(int matrix[][]) {
        int row = matrix.length, col = matrix[0].length;
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {

                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 4, 7, 8 },
                { 8, 7, 7 },
                { 8, 7, 7 } };
        transpose(matrix);
    }
}
