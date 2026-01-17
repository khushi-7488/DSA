package Strings;

public class Largest {
    public static void largest(String fruits[]){
        String largest = fruits[0];
        for(int i =1; i< fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0 ){
             largest = fruits[i];
            }
        }
         System.out.println(largest);
    }

    public static void main(String ars[]) {
        String fruits[] = { "apple", "mango", "banana" };
        largest(fruits);
    }
}
