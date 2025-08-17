public class Overriding{
    public static void main(String[] args) {
         Dog a = new Dog();
        a.sound();
    }

}

class Animal {
      void sound(){
        System.out.println("Animal makes sound ");
      }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog braks");

    }
}