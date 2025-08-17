public class Static {
    public static void main(String args[]){
        Student s1=new Student ();
        s1.schoolNAme="JVM";

        Student s2=new Student();
        System.out.println(s2.schoolNAme);

        Student s3=new Student();
        s3.schoolNAme="abcdefghijklmnopqrstuvwxyz";

        System.out.println(s1.schoolNAme); // abcdefghijklmnopqrstuvwxyz
        System.out.println(s2.schoolNAme); // abcdefghijklmnopqrstuvwxyz
        System.out.println(s3.schoolNAme); // abcdefghijklmnopqrstuvwxyz


    }
}

class Student{
    String name ;
    int roll;
    static String schoolNAme;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}