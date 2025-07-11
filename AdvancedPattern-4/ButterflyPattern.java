public class ButterflyPattern{
    public static void butterFlyPattern(int n){
        // first half code
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space for this code
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Second half code

        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space for this code
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int n =10;
        butterFlyPattern(n);

    }
}