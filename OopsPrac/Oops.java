package OopsPrac;

public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColour("Blue");
        System.out.println(p1.colour);
    }

}

class Pen {
    String colour;
    int tip;

    void setColour(String newColour) {
        colour = newColour;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
