import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Swap_array {
    public static void main(String[] args) {
        Integer[] ar ={80,90,100,1,2,110};
//        for (int i = 0; i < ar.length; i++) {
//            for (int j = i+1; j < ar.length; j++) {
//                if (ar[i]>ar[j]) {
//                    int temp =ar[i];
//                    ar[i]=ar[j];
//                    ar[j]=temp;
//                }
//            }
//        }
//
//        for (int k = 0; k < ar.length ; k++) {
//            System.out.println(ar[k]);
//
//
//        }
        int d= ar.length;
        System.out.println(ar[d-1]);
        // To getting a second highest array
//        int g= ar.length;
        Arrays.sort(ar,Collections.reverseOrder());
        for (int ch:ar){
            System.out.println(ch);
        }



        // reverse order

    }
}
