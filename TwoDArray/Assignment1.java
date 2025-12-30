package TwoDArray;

public class Assignment1 {
    public static int search(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    count++;
                } 
            }
        }return count;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 9 }, { 11, 4, 3 } };
        int key = 3;
       System.out.println(search(matrix, key)); 
    }
}
