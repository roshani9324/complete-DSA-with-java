public class functions {
    // public static void printHelloWorld(){
    //     System.out.println("Hello World");
    // }
    // public static void calCulate(int a, int b)//parameters
    // {
    //     int sum = a + b;
    //     System.out.println("Sum: " + sum);
    // }
    // public static void main(String[]args){
    //     int a=5,b=9;
    //     calCulate(a, b);//arguments
    //     printHelloWorld(); 

    // }

    // public static void main(String[]args){
    //     int a=5,b=9;
    //     int temp=a;
    //     a=b;
    //     b=temp;
    //     System.out.println("a: " + a);
    //     System.out.println("b: " + b);
    // } 
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    
    }
    public static void main(String[]args){
        int a=5,b=9;
        System.out.println("Product: " + multiply(a, b));   
    }
    
    
    
}
