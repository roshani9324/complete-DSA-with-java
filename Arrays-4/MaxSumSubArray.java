public class MaxSumSubArray {
    public static void maxSubarrayPrefix(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE; 
        int prefix[]=new int [numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix[i-1];i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end= j;
                currSum=start==0? prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }

            }


        }
        System.out.println("max sum ="+maxSum);
    }
    public static void kadans(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<numbers.length;i++){
            currentSum=currentSum+numbers[i];
            if(currentSum<0){
                currentSum=0;
            }
            ms=Math.max(currentSum, ms);
        }
        System.out.println("Kadans rule using Our max subarray sum is :" +ms);


    }

    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        maxSubarrayPrefix(numbers);
        kadans(numbers);

        
    }
    
}
