package TwoDArrayPrac;

public class Spiral {
    public static void spiral(int matrix[][]) {
        int startrow = 0, endrows = matrix.length - 1, startcol = 0, endcol = matrix[0].length - 1;
        while (startrow <= endrows && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            // right
            for (int i = startrow + 1; i <= endrows; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            // down
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrows) {
                    break;
                }
                System.out.print(matrix[endrows][j] + " ");
            }
            // left
            for (int i = endrows - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }
            startrow++;
            endrows--;
            startcol++;
            endcol--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 4, 5, 6, 7 },
                { 5, 6, 7, 8 },
                { 1, 3, 6, 9 } };
        spiral(matrix);
    }
}
