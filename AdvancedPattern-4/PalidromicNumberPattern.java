public class PalidromicNumberPattern {
    public static void palidromicnumberpattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        palidromicnumberpattern(5);

    }
}
