public class Factorial {



    public static void main(String[] args) {
//        for (int num = 1; num <=10; num++) {
        int num =4;
        int output = 1;
        for (int i = num; i>=1 ; i--) {
            output = output*i;
        }
    System.out.println(num +" Factorial value was " +output);
    }
}
//}