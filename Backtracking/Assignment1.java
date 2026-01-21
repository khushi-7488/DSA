package Backtracking;

public class Assignment1 {
    public static int grids(int maze[][], int x, int y) {
        // base case
        if (x == maze.length - 1 || y == maze.length - 1) {
            return 1;
        } 
        if(maze[x][y]==0){
            return 0;
        }

        int w1 = grids(maze, x, y + 1);
        int w2 = grids(maze, x + 1, y);
        return w1 + w2;
    }

    public static void printPaths(int maze[][], int x, int y, String path) {
        // out of bounds or blocked cell
        if (x >= maze.length || y >= maze.length || maze[x][y] == 0) {
            return;
        }
        
        // reached destination
        if (x == maze.length - 1 && y == maze.length - 1) {
            System.out.println(path + "(" + x + "," + y + ")");
            return;
        }
        
        // move right
        printPaths(maze, x, y + 1, path + "(" + x + "," + y + ") -> ");
        // move down
        printPaths(maze, x + 1, y, path + "(" + x + "," + y + ") -> ");
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 1, 1, 1, 1 } };
       
        System.out.println("Total paths: " + grids(maze, 0, 0));
        System.out.println("\nAll possible paths:");
        printPaths(maze, 0, 0, "");
    }
}
