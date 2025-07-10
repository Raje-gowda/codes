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



    }
}
