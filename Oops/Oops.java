package Oops;

public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created Pen object
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen {
    // getter
    private String color;
    int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // setter
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}
