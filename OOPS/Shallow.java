public class Shallow{
    public static void main(String args[]){
          

        int [] marksArray={90,80,70};
        Student s1=new Student("Roshani",marksArray);
        Student s2 =new Student(s1);//Shallow copy

        //change marks in s2
        s2.marks[0]=100;

        System.out.println("Original Student marks:"+s1.marks[0]);//100
        System.out.println("Copied Student marks :"+s2.marks[0]);//100
        
    }
}
class Student {
    String name;
    int [] marks; // Array is mutable, so copying reference can cause issues4

    //constructor
    Student( String name, int[] marks){
        this.name=name;
        this.marks=marks;//reference copy

    }

    Student (Student other){
        this.name=other.name;
        this.marks=other.marks;//same array reference
    }



}

