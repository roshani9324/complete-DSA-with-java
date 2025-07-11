public class Floyd_sTriangle {
    public static void floydTriangle(int row){
        int counter=1;
        for(int i=1;i<row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;

            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int row = 7;
        floydTriangle(row);

    }     

    
}