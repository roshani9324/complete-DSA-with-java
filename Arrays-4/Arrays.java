import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        //creating an array
        //1.)int[] payment=new int[90];
        //2.)int payment []={1,2,3,4};
        //3.)String payment []={"hello","Welcome"};


        int subject[]=new int[100];
        Scanner sc=new Scanner(System.in);

        subject[0]=sc.nextInt();
        subject[1]=sc.nextInt();
        subject[2]=sc.nextInt();

        System.out.println("phy:"+subject[0]);
        System.out.println("chem :"+subject[1]);
        System.out.println("math :" + subject[2]);

        int percentage=(subject[0]+subject[1]+subject[2])/3;
        System.out.println("percentage = "+percentage+"%");
        System.out.println("Length of array" +subject.length);
        sc.close();



    }
    
}
