public class LargestNumber {
    public static int getLargestNumber(int number[]){
        int largest=Integer.MIN_VALUE;//-infinity

        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int number[]={1,23,4,5,6,7,88,4,7,};

        System.out.println("Largest value in a array :"+getLargestNumber(number));



    }
}
