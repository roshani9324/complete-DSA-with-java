public class BinaryToDecimal {
    // Function to convert binary to decimal
    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal number is "+myNum+" :="+decNum);

    }
    public static void main(String[]arg){
        binToDec(101);
        // Example binary number: 101
        // Expected output: Decimal number is: 5
        binToDec(1111);
        // Example binary number: 1111
        // Expected output: Decimal number is: 15

    }
}
