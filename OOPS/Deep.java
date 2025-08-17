public class Deep{
public static void main (String arg[]){
    int [] marksArray={90,80,70};
    Student s1=new Student ("Roshani",marksArray);
    Student s2 =new Student(s1);

    //change marks in s2
    s2.marks[0]=100;
     System.out.println("Original Student marks: " + s1.marks[0]);//90
    System.out.println("Copied Student marks: " + s2.marks[0]);//100 
 

}
}

class Student{
    String name;
    int [] marks;
    Student (String name,int[] marks){
        this.name=name;
        this.marks=marks;
    }

    Student(Student other){
        this.name=other.name;
        this.marks=new int[other.marks.length];//new array
        for(int i=0;i<other.marks.length;i++){
            this.marks[i]=other.marks[i];//copy values
        }
    }
}