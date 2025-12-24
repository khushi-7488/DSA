import java.util.*;

public class Arr {

    // reverse of a array
    public static void reverse(int num[]) {
        int first = 0;
        int last = num.length - 1;
        while(first  < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        reverse(num);
    }

}
// finding a number in binarySearch
// public static int binarySearch(int num[], int key) {
// int start = 0;
// int end = num.length - 1;

// for (int i = start; i <= end; i++) {
// int mid = (start + end) / 2;
// if (num[mid] == key) {
// return mid;
// }
// if (num[mid] > key) {
// end = mid - 1;
// } else {
// start = mid + 1;
// }
// }
// return -1;
// }

// public static void main(String[] args) {
// int num[] = { 5, 10, 12, 15, 17, 18, 19 };
// int key = 17;
// int search = binarySearch(num, key);
// System.out.println(search);
// }
// }

// largest number linear search
// public static int largest(int num[]) {
// int min = Integer.MIN_VALUE;
// for (int i = 0; i < num.length; i++) {
// if (min < num[i]) {
// min = num[i];
// }
// }
// return min;
// }

// public static void main(String args[]) {
// int num[] = { 1, 2, 3, 5, 7, 4 };
// System.out.println(largest(num));

// }
// }

// find the number linear search
// public static int linearSearch(int numbers[], int key) {
// for (int i = 0; i < numbers.length; i++) {
// if (numbers[i] == key) {
// return i;
// }

// }
// return -1;
// }

// public static void main(String[] args) {
// int numbers[] = { 2, 4, 7, 10, 11 };
// int key = 10 ;

// int index = linearSearch(numbers, key);
// if (index == -1) {
// System.out.println("not found");
// }else{
// System.out.println(index);
// }

// }
// }

// update a array
// public static void update(int marks[]) {
// for (int i = 0; i < marks.length; i++) {
// marks[i] = marks[i] + 2;
// }
// }

// public static void main(String[] args) {

// int marks[] = { 99, 89, 96 };
// update(marks);
// for (int i = 0; i < marks.length; i++) {
// System.out.println(marks[i]);
// }

// basic array
// int marks[] = new int[50];

// Scanner sc = new Scanner(System.in);
// marks[0] = sc.nextInt();
// marks[1] = sc.nextInt();
// marks[2] = sc.nextInt();

// System.out.println("phy :" + marks[0]);
// System.out.println("chem :" + marks[1]);
// System.out.println("math :" + marks[2]);

// int percentage = (marks[0]+marks[1]+marks[2])/3;
// System.out.println(percentage + "%");

// System.out.println(marks.length);
