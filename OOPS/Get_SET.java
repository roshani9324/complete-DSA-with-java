public class GET_SET{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println("Pen Color: " + p1.getColor());
        p1.setTip(5);
        System.out.println("Pen Tip: " + p1.getTip());


}}
class Pen {
    private String color;
    private int tip;

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String newColor) {
        color = newColor;
    }

    // Getter for tip
    public int getTip() {
        return tip;
    }

    // Setter for tip
    public void setTip(int newTip) {
        tip = newTip;
    }
}