
public class factorial1 {
    // factorial of a number ,n
    public static int factorials(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    // public static void main(String[] args) {
    //     System.out.println(factorials(5));
    // }

    //Find Binomial coefficient value
    public static int bitOffset(int n,int r){
        int fact_n=factorials(n);
        int fact_r=factorials(r);
        int fact_nmr=factorials(n-r);
        int binCoeff=fact_n /(fact_r*fact_nmr);
        return binCoeff;

    }

    public static void main(String []args){
        System.out.println(bitOffset(5, 2));

    }
}
