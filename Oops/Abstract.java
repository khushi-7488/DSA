package Oops;

public class Abstract {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();

}

class Horse extends Animal{
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal{
    void walk (){
        System.out.println("walks on two legs");
    }
}