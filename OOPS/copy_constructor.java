 public class copy_constructor{
    public static void main(String[] args) {
        // Original Student
        Student s1 = new Student("Roshani Maurya", 25);

        // Copy Student using copy constructor
        Student s2 = new Student(s1);

        // Print both
        System.out.println("Original Student: " + s1.getName() + ", Age: " + s1.getAge());
        System.out.println("Copied Student: " + s2.getName() + ", Age: " + s2.getAge());
    }

}
class Student {
    private String name;
    private int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ✅ Copy Constructor
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getters for verification
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}