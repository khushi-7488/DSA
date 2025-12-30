package TwoDArray;

public class Spiral {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 4, 5, 6, 7 },
                { 5, 6, 7, 8 },
                { 1, 3, 6, 9 } };
        int startrow = 0;
        int endrows = matrix.length -1;
        int startcol = 0;
        int endcol = matrix[0].length-1;
        while (startrow <= endrows && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            // right
            for (int j = startrow + 1; j <= endrows; j++) {
                System.out.print(matrix[j][endcol] + " ");
            }
            // bottom
            for (int j = endcol - 1; j >= startrow; j--) {
                System.out.print(matrix[endrows][j] + " ");
            }
            // left
            for (int j = endrows - 1; j >= startrow + 1; j--) {
                System.out.print(matrix[j][startcol] + " ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrows--;
        }
    }
}
