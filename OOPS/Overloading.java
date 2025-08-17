public class Overloading{
    public static void main(String[] args) {
    Calculator calc=new Calculator();
    System.out.println(calc.sum(1,2));
    System.out.println(calc.sum(1.5f,2.5f,8.9f));
    System.out.println(calc.sum(1,2,3));
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b,float c){
        return a+b+c;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}