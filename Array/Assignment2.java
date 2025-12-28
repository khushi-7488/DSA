public class Assignment2 {
    public static int rotate(int num[], int key) {
        int n = num.length;
        int end = n - 1;
        int start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num[mid] == key) {
                return mid; // Found the key, return the index
            }

            if (num[start] <= num[mid]) { // left sorted
                if (num[start] <= key && key <= num[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // right sorted
                if (num[mid] <= key && key <= num[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = { 3, 4, 5, 6, 7, 0, 1, 2 };
        int key = 0;
        System.out.println(rotate(num, key));
    }
}
