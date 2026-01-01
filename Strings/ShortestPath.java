package Strings;

public class ShortestPath {
    public static double shortestPath(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W') {
                x--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'N') {
                y++;
            }
        }
        int newx = x * x;
        int newy = y * y;
        double result = Math.sqrt(newx + newy);
        return result;
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}
