public class SortedMatrix {
    public static boolean matrixSorted(int matrix[][],int key){
        int row =0, col = matrix[0].length-1;
        while (row<matrix.length && col>=0) {
            if(matrix[row][col]==key){
                System.out.println("Found key at(" + row +","+ col + ")");
            return true;
        }
        else if(key <matrix[row][col]){
            col--; 
        }else {
            row++;
        }
            
        }
        System.out.println("key not found !");
        return false;
    }
    
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 11, 12, 13, 14 },
                { 21, 22, 23, 24 },
                { 31, 32, 33, 34 } };
                int key =33;
                matrixSorted(matrix, key);

    }
}
