public class HollowRectangle{
    public static void hollo_rectangle(int row,int col ){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    // Print the border of the rectangle
                    System.out.print("*");
                    continue;
                }
                else{
                    // Print the hollow part of the rectangle
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        int row = 5;
        int col = 5;
        hollo_rectangle(row, col);

        
    }
    
}