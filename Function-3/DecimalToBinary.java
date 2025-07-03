public class DecimalToBinary {
    // Function to convert decimal to binary
    public static void decToBin(int decNum){
        int pow=0;
        int binNum=0;
        int myNum=decNum;
        while(decNum>0){
            int reminder=decNum%2;
            binNum=binNum+(reminder*(int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;

        }
        System.out.println("Binary number is "+myNum+" :="+binNum);
    }


    public static void main(String[]args){
        decToBin(7);
        // Example decimal number: 7
        // Expected output: Binary number is: 111
        decToBin(15);
        // Example decimal number: 15
        // Expected output: Binary number is: 1111

    }
}