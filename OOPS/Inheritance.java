// Parent Class
class Product {
    String brand;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Child Class 1
class Pen extends Product {
    String color;
    int tip;

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

    void displayPen() {
        System.out.println("Pen Color: " + color + ", Tip: " + tip);
    }
}

// Child Class 2
class Student extends Product {
    String name;
    int age;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void displayStudent() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setBrand("Reynolds");
        p1.setColor("Blue");
        p1.setTip(5);
        p1.displayBrand();
        p1.displayPen();

        Student s1 = new Student();
        s1.setBrand("CBSE");
        s1.setName("Roshani");
        s1.setAge(21);
        s1.displayBrand();
        s1.displayStudent();
    }
}
