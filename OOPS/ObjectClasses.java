public class ObjectClasses {

    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        Student s1 = new Student();
        s1.studentAge(56);
        System.out.println(s1.age);
        s1.studentName("Roshani Maurya");
        System.out.println(s1.name);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;

    void studentAge(int newAge) {
        age = newAge; // Assign parameter value to instance variable
    }

    void studentName(String newName) {
        name = newName; // Assign parameter value to instance variable
    }
}
  