package StringPrac;

public class ShortestPath {
    public static float shortest(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W') {
                x = x - 1;
            } else if (str.charAt(i) == 'E') {
                x = x + 1;
            } else if (str.charAt(i) == 'N') {
                y = y + 1;
            } else {
                y = y - 1;
            }
        }
        System.out.println(x + " " + y);
        int x1 = x * x;
        int y1 = y * y;
        return (float) Math.sqrt(x1 + y1);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortest(str));
    }

}
