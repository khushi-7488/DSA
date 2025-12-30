package TwoDArray;

public class Assignment3 {
    public static void sum(int matrix[][]) {
        int col = 3;
        int row = 2;
        int trans[][] = new int[col][row];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[0].length; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 9 }, { 7, 4, 2 } };
        sum(matrix);
    }

}
