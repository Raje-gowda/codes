import java.lang.reflect.Array;
import java.util.Arrays;

public class Second_Highest_array {

    //Adding of number to get single digit
    public static void add(int num ){
        int sumofDigit=0;
        while (num!=0){
//            int digit=num%10;
            sumofDigit=sumofDigit+(num%10);
            num/=10;
        }
        while (sumofDigit>10){
            int sum=0;
            while (sumofDigit!=0){
                sum=sum+(sumofDigit%10);
                sumofDigit/=10;
            }
            sumofDigit=sum;
        }
        System.out.println(sumofDigit);
    }
    public static void main(String[] args) {
      int num= 123456;
//      int Reverse_Number = 0;
//      while (num!=0){
//          int Result = num%10;
//          Reverse_Number=Reverse_Number*10+Result;
//          num=num/10;
//      }
//      System.out.println(Reverse_Number);
//      if(num == Reverse_Number){
//          System.out.println(" is palinedrome number");
//      }
//      else {
//          System.out.println(" is not palinedrome ");
//      }


    }
}

