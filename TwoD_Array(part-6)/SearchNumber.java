import java.util.Scanner;

public class SearchNumber {
 public static boolean search(int matrix[][] ,int key){
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==key){
                System.out.println("Element Found at index ( " + i + "," +j+  ")" );
            return true;
            }

        }
    }
    System.out.println("key not found");
    return false;
 }


    public static void main(String args[]){
        int matrix[][]=new int [3][3];
        int n=matrix.length,m=matrix[0].length;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3x3 matrix elements:");

        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();

        System.out.println("Print a matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println();
        }
        search(matrix, 5);
    }
}
