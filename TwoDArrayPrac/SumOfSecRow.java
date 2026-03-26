package TwoDArrayPrac;

public class SumOfSecRow {
    public static void sum(int matrix[][]) {
        for (int i = 1; i < matrix.length - 1; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
                sum += matrix[i][j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 } };
        sum(matrix);
    }
}
