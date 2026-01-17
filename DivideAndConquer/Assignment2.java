package DivideAndConquer;

public class Assignment2 {
    public static int mejority(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 3, 3, 1, 3, 4 };
        System.out.println(mejority(arr));
    }
}
