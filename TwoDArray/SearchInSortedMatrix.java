package TwoDArray;

public class SearchInSortedMatrix {

    public static boolean search(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        for (int i = row; i < matrix.length; i++) {
            for (int j = col; j >= 0; j--) {
                if (key == matrix[i][j]) {
                    System.out.println("(" + i + "," + j + ")");
                    return true;
                } else if (key < matrix[i][j]) {
                    col--;
                } else {
                    row++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;
        System.out.println(search(matrix, key));
    }
}
