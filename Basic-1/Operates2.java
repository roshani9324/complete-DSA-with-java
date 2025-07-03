import java.util.*;

public class Operates2 {
        public static void main(String[] args) {
                // int x=9,y=12;
                // int a=2,b=4,c=6;
                // int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b *
                // y);
                // System.out.println(exp);

                // Question 1 : Write a Java program to get a number from the user and print
                // whether it is positive or negative
                // Scanner sc= new Scanner(System.in);
                // int x = sc.nextInt();

                // if(x>0){
                // System.out.println("x is positive");
                // }else {
                // System.out.println("x is negative");
                // }
                // sc.close();

                // Question 2 : Finish the following code so that it prints You have a fever if
                // your temperature is above 100 and otherwise prints You don't have a fever.
                // double temperature = 101.5;
                // if(temperature>100){
                // System.out.println("You have a fever");
                // }
                // else{
                // System.out.println("You don't have a fever");
                // }

                // Question 3 : Write a Java program to input week number(1-7) and print day of
                // week name using switch case.
                // Scanner sc=new Scanner(System.in);
                // int weekNumber=sc.nextInt();
                // switch(weekNumber){
                // case 1:System.out.println("Monday");
                // break;
                // case 2:
                // System.out.println("Tuesday");
                // break;
                // case 3:
                // System.out.println("Wednesday");
                // break;
                // case 4:
                // System.out.println("Thursday");
                // break;
                // case 5:
                // System.out.println("Friday");
                // break;
                // case 6:
                // System.out.println("Saturday");
                // break;
                // case 7:
                // System.out.println("Sunday");
                // break;
                // default: System.out.println("Invalid week number");
                // sc.close();

                // }

                // Question 5 : Write a Java program that takes a year from the user and print
                // whether that year is a leap year or not.

                // Scanner sc=new Scanner(System.in);
                // System.out.println("Enter a year:");
                // int year=sc.nextInt();
                // if(year%4==0 && year%100!=0 || year%400==0){
                // System.out.println(year + " is a leap year.");}
                // else{
                // System.out.println( year + " is not a leap year.");
                // }
                // sc.close();

                // Question print the 1 to 10
                // int count=1;
                // while(count<=10){
                // System.out.println(count);
                // count++;
                // }

                // Question take user input and print 1 to n
                // Scanner sc= new Scanner(System.in);
                // System.out.println("Enter a number:");
                // int range=sc.nextInt();
                // int count=1;
                // while(count<=range){
                // System.out.println(count);
                // count++;
                // }
                // sc.close();

                // LOOPS QUESTIONS

                // for(int i=0;i>=10;i++){
                // System.out.println(i);
                // }

                // print square pattern
                // for(int i=1;i<=5;i++){
                // for(int j=1;j<=5;j++){
                // System.out.print("*");
                // }
                // System.out.println("*");
                // }

                // print Reverse of number
                // Scanner sc=new Scanner(System.in);
                // int num=sc.nextInt();
                // while(num>0){
                // int digit=num%10;// Get the last digit
                // System.out.println(digit);// Print the digit
                // num=num/10;// Remove the last digit from the number
                // }
                // System.out.println();
                // sc.close();

                // Reverse the given number
                // int n=10899;

                // int rev=0;
                // while(n>0){
                // int lastdigit=n%10;
                // rev=rev*10+lastdigit;
                // n=n/10;
                // }
                // System.out.println("Reversed number is: " + rev);

                // int counter = 1;
                // do {
                // System.out.println("Hello world ");
                // counter++;
                // } while (counter <= 10);

                // for (int i = 1; i <= 5; i++) {
                // if (i == 4) {
                // break;

                // }
                // System.out.println(i);
                // }
                // System.out.println("Loop ended");

                // keep entering number till user enter a multiple of 10

                // Scanner sc = new Scanner(System.in);
                // do {
                // int n = sc.nextInt();
                // if (n % 10 == 0) {
                // System.out.println("You entered a multiple of 10: " + n);
                // break;
                // }
                // } while (true);
                // sc.close();

                // Continue statement example
                // for (int i=1; i<=5;i++){
                // if(i==4){
                // continue;
                // }
                // System.out.println(i);

                // }
                // System.out.println("Loop ended");

                // Question Display the number entered by user except multiple of 10
                // Scanner sc = new Scanner(System.in);
                // do {
                // System.out.println("Enter a number:");
                // int n = sc.nextInt();
                // if (n % 10 == 0) {
                // continue;
                // }
                // System.out.println("You entered a number: " + n);
                // } while (true);

                // check if a number is prime or not
                // Scanner sc = new Scanner(System.in);
                // System.out.println("Enter a number to check if it is prime:");
                // int num= sc.nextInt();
                // if(num==2){
                // System.out.println(num+"n is prime number");
                // }
                // else{
                // boolean isPrime = true;
                // for (int i = 2; i <= num - 1; i++) {
                // if (num % i == 0) {
                // isPrime = false;
                // System.out.println(num + " is not a prime number.");
                // }
                // }
                // if (isPrime == true) {
                // System.out.println(num + " is a prime number.");
                // } else {
                // System.out.println(num + " is not a prime number.");
                // }
                // }
                // sc.close();



                // Question 2 : Write a program that reads a set of integers, and then prints
                // the sum of the even and odd integers
                // Scanner sc = new Scanner(System.in);
                // int evenSum = 0;
                // int oddSum = 0;
                // System.out.println("Enter the count of integers you want to input:");
                // // Read the count of integers
                // int count = sc.nextInt();
                // System.out.println("Enter " + count + " integers:");
                // for (int i = 0; i < count; i++) {
                //         int num = sc.nextInt();
                //         if (num % 2 == 0) {
                //                 evenSum += num;
                //         } else {
                //                 oddSum += num;
                //         }
                // }
                // System.out.println("Sum of even integers: " + evenSum);
                // System.out.println("Sum of odd integers: " + oddSum);
                // sc.close();

                // Question 3 : Write a program to find the factorial of any number entered by the user
                // Scanner sc =new Scanner(System.in);
                // int num = sc.nextInt();
                // int factorial = 1;
                // for(int i=1;i<=num;i++){
                //         factorial*=i;
                // }
                // System.out.println("Factorial of " + num + " is: " + factorial);
                // sc.close();

                // Question 4 : Write a program to print the multiplication table of a number N, entered by the user
                Scanner sc =new Scanner(System.in);
                int num = sc.nextInt();
                System.out.println("Multiplication table of " + num + ":");
                for(int i=1;i<=num;i++){
                        System.out.println(num+"x"+i+"="+(num*1));
                }
                sc.close();


        }


}
