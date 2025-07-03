public class Overloading {
    // Method overloading example
    // public static int add(int a, int b) {
    //     return a + b;
    // }
    // public static int add(int a, int b, int c) {
    //     return a + b + c;
    // }
    // public static void main(String[] args) {
    //     System.out.println(add(5, 6));
    //     System.out.println(add(5, 7, 8));
    // }
     
    // check if a number is prime or not
    // public static boolean isPrime(int n){
    //     boolean isPrime=true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             isPrime=false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    // public static void main(String[] args) {
    //     System.out.println(isPrime(5)); // true
    //     System.out.println(isPrime(10)); // false
    //     System.out.println(isPrime(13)); // true
    //     System.out.println(isPrime(20)); // false
    // }


    //Print all prime in range
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void primeRange(int n){
        
        for (int i=2; i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+",");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeRange(100); 
        // Prints all prime numbers in the range 1 to 20
        }
}
