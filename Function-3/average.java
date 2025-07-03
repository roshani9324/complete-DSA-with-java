import java.util.Scanner;

public class average {
  // Question 1 : Write a Java method to compute the average of three numbers..
  // public static double averages(double a,double b,double c){
  // double avg=(a+b+c)/3;
  // return avg;
  // }
  // public static void main(String args[]){
  // Scanner sc=new Scanner(System.in);
  // System.out.println("Enter three numbers to find average");
  // double a=sc.nextDouble();
  // System.out.println("Enter second number");
  // double b=sc.nextDouble();
  // System.out.println("Enter third number");
  // double c=sc.nextDouble();
  // System.out.println("Average of three numbers is "+averages(a,b,c));
  // sc.close();
  // }

  // Question 2 : Write a method named isEven that accepts an int argument. The
  // method should return true if the argument is even, or false otherwise.Also
  // write a program to test your method
  // public static boolean isEven(int argument){
  // if(argument%2==0){
  // System.out.println(argument+" is even");
  // return true;
  // }
  // else{
  // System.out.println(argument+" is odd");
  // return false;
  // }
  // }
  // public static void main(String args){
  // Scanner sc= new Scanner(System.in);
  // System.out.println("Enter a number to check if it is even or odd");
  // int argument=sc.nextInt();
  // isEven(argument);
  // sc.close();
  // }

  // Question 3 : Write a Java program to check if a number is a palindrome in
  // Java?
  // public static boolean isPalindrome(int number) {
  //   int originalNumber = number;
  //   int reverseNumber = 0;
  //   while (number > 0) {
  //     int reminder = number % 10;
  //     reverseNumber = reverseNumber * 10 + reminder;
  //     number = number / 10;
  //   }
  //   if (originalNumber == reverseNumber) {
  //     System.out.println(originalNumber + " is a palindrome");
  //     return true;
  //   } else {
  //     System.out.println(originalNumber + " is not a palindrome");
  //     return false;
  //   }
  // }

  // public static void main(String args[]) {
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("Enter a number to check if it is a palindrome");
  //   int number = sc.nextInt();
  //   isPalindrome(number);
  //   sc.close();
  // }

  // Question 5 :Write a Java method to compute the sum of the digits in an integer.
  public static int sumOfDigit(int number){
    int sum=0;
    while(number>0){
      int lastDigit=number%10;
      sum=sum+lastDigit;
      number=number/10;
    }
    return sum;
  }
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number to find the sum of its digits");
    int number=sc.nextInt();
    int sum=sumOfDigit(number);
    System.out.println("The sum of the digits in "+number+" is "+sum);
    sc.close();
  }

}
