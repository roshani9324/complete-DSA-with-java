interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MyClass implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("Method A from InterfaceA");
    }

    public void methodB() {
        System.out.println("Method B from InterfaceB");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}

