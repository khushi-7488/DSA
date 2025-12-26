import java.util.*;

public class Arr {

    // find the maximum value by using prefix sum 
    public static void maxArrays(int num[]) {

        int prefix[] = new int[num.length];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("max sum is : " + max);

    }

    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 5, 6 };
        maxArrays(num);
    }

}

// print subArrays find sum and min and max value
// public static void subArrays(int num[]) {
// int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;
// for (int i = 0; i < num.length; i++) {
// for (int j = i; j < num.length; j++) {
// int sum = 0;
// for (int k = i; k <= j; k++) {
// sum = num[k] + sum;
// if (sum > max) {
// max = sum;
// }

// if (sum < min) {
// min = sum;
// }

// System.out.print(num[k] + " ");
// }
// System.out.println("sum is : " + sum);
// System.out.println();
// }
// System.out.println();

// }
// System.out.println("max is " + max);
// System.out.println("min is " + min);
// }

// public static void main(String[] args) {
// int num[] = { 2, 3, 4, 5, 6 };
// subArrays(num);
// }

// }

// pairing the numbers
// public static void pairs(int num[]) {
// for (int i = 0; i < num.length; i++) {
// for (int j = i + 1; j < num.length; j++) {
// System.out.print("(" + num[i] + "," + num[j] + ") ");
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// int num[] = { 2, 3, 4, 5, 6 };
// pairs(num);
// }

// }

// reverse of a array
// public static void reverse(int num[]) {
// int first = 0;
// int last = num.length - 1;
// while(first < last) {
// int temp = num[last];
// num[last] = num[first];
// num[first] = temp;
// first++;
// last--;
// }
// for (int i = 0; i < num.length; i++) {
// System.out.print(num[i] + " ");

// }
// }

// public static void main(String[] args) {
// int num[] = { 2, 4, 6, 8, 10 };
// reverse(num);
// }

// }

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
// int max = Integer.MIN_VALUE;
// for (int i = 0; i < num.length; i++) {
// if (max > num[i]) {
// max = num[i];
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
