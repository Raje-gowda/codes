import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args){
        int ar[]= {1,2,4,3,1,2,4,5,6,3,};



        for (int i = 0; i < ar.length-1 ; i++) {
            int count=0;
            for (int j = 0; j < ar.length; j++) {

                    if ((ar[i] == ar[j])) {
                        count++;
//                        System.out.println(ar[i] + " thsi is an duplicate number");


                }
            }
            if(count==1){
                System.out.println(ar[i]+ " "+"is not a duplicate number");
            }
        }
        int[] num={1,3,4,6,7,8,6,5,4,2};

        LinkedHashSet<Integer> nu=new LinkedHashSet<Integer>();
        for (int a:num){
            nu.add(a);
        }
        Set<Integer> r=new HashSet<>();
        for (int i:nu){
            int con=10-i;
            if(r.contains(con)){
                System.out.println(i+" + "+con+" = "+"10");
            }
            r.add(i);
        }





    }
}
