package TwoDArray;

public class Assignment2 {
    public static int sum(int matrix[][]) {
        int sum = 0;
            for (int j = 0; j < matrix[0].length ; j++){
                sum += matrix[1][j];
            }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 9 }, { 11, 4, 3 }, { 5, 7, 3 } };

        System.out.println(sum(matrix));
    }
}
