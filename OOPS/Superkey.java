public class Superkey{
    public static void main(String args[]){
        Child obj=new Child();
        obj.display();
        obj.showName();

    }
}

class Parent{
    String name="Parent Class";

    //Parent Constructor
    Parent(){
        System.out.println("Parent Constructor Called");
    }
    //Parent method
    void display(){
        System.out.println("This is Parent Method");
    }
}

class Child extends Parent{
    String name="Child class";

    //Child constructor
    Child(){
        super();
        System.out.println("Child Constructor Called...");

    }
    //child method
    void display(){
        super.display();//call parent method
        System.out.println("this is child method");
    
    }
    void showName(){
        System.out.println("Child name :"+name);
        System.out.println("Parent name using super :"+super.name);
    }
}