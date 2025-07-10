import java.util.Arrays;
import java.util.Collections;

public class linear {
    public static void main(String[] args){
        Integer[] arr ={80,90,100,1,2,110};
        int length = arr.length;
       int ArrayLength= arr.length;

       // Incriment order

        Arrays.sort(arr);

        System.out.print(arr[length-1]);
        System.out.println(length);
        for (int Incriment_order : arr){
            System.out.print(Incriment_order+ " ");


        }
        System.out.println();
        Arrays.sort(arr , Collections.reverseOrder());
        for(int Decrement_order : arr){
            System.out.print(Decrement_order + " ");
        }



    }

}

