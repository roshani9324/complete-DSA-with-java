public class question {
    // Question 1 Print the number of 7’s that are in the 2d array 
    public static void main(String args[]){
        int array[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int countof7=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==7){
                    countof7++;
                }
            }

        }
        System.out.println("count of 7 is " +countof7);

    }
}
