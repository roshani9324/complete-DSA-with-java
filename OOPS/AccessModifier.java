public class AccessModifier{
 public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);  // Access via getter
        p1.setTip(5);
        System.out.println(p1.tip);

       
    }
}

// PUBLIC class: Accessible from anywhere
public class Pen {
    // private: accessible only inside this class
    private String color;

    // default (package-private): accessible within same package
    int tip;

    // protected: accessible within package and subclasses
    protected String brand = "Reynolds";

    // public: accessible from anywhere
    public void setColor(String newColor) {
        color = newColor;
    }

    public void setTip(int newTip) {
        tip = newTip;
    }

   
}