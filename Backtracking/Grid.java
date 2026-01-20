package Backtracking;

public class Grid {
    public static int grids(int grid[][], int x, int y) {
        // base case
        if (x == grid.length - 1 || y == grid.length - 1) {
           return 1;
        }else if(x == grid.length || y == grid.length ){
            return 0;
        }
        int w1 = grids(grid, x, y + 1);
        int w2 = grids(grid, x + 1, y);
        return w1 + w2;
    }

    
    public static void main(String[] args) {
        int n = 1000;
        int grid[][] = new int[n][n];
       System.out.println(grids(grid, 0, 0));
    }
}
 