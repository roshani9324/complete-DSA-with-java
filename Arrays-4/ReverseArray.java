public class ReverseArray {
    public static void reverseArray(int array[]){
        int first=0,last=array.length-1;
        while(first<last){
            int temp =array[last];
            array[last]=array[first];
            array[first]=temp;
            first++;
            last--;
        }

    }
    public static void main(String args[]){
        int [ ] array={10,9,8,7,6,5,4,3,2,1};
        reverseArray(array);

        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }
}
