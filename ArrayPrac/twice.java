package ArrayPrac;

public class twice {
    public static boolean twice(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                } else {

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 4, 5 };
        System.out.println(twice(arr));
    }
}
