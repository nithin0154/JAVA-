package OOPS;
public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("yellow");
        p1.setTip(9);
        System.out.println(p1.getColor() + " " + p1.getTip());
    }

}

class Pen {
    private String color;
    private int tip;

    void setColor(String newColor) {
         color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }
}