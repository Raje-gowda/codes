//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   static void Fine_Number_Even_Or_Not(int num){
       if(num <=10){
           if(num%2==0){
               System.out.println(num + " IS Even Number");
           }
           if(num%2!=0){
               System.out.println(num + " Is Not Even Number");
           }
           num++;
           Fine_Number_Even_Or_Not(num);
       }
   }

    public static void main(String[] args) {
//Fine_Number_Even_Or_Not(4);
        String s1 = " Hello";
        String s2 = " Word ";

        s1= s1+s2;
        System.out.println(s1);
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);

        }}

