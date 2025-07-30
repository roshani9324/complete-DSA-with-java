public class DiagonalSum {
    public static int  diagonalSum(int matrix[][]){
         int sum=0;
         for(int i=0;i<matrix.length;i++ ){
            for(int j=0; j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }

            }
         }
         return sum;
    }
    public static void main(String args[]){
        int matrix[][] = { { 1, 2, 3, 4 },
                { 11, 12, 13, 14 },
                { 21, 22, 23, 24 },
                { 31, 32, 33, 34 } };
        int result = diagonalSum(matrix);
        System.out.println("Diagonal Sum: " + result); // Output: 140        
    }
}
