import java.text.Format;

public class DuplicateString {
    public static void main(String[] args){
      String name = "RAJEGOWDA_Gama";
      int length = name.length();
      System.out.println(length);
      int count = 0;
      char ch [] = name.toCharArray();
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j <length ; j++) {
                if (ch[i]== ch[j]){
                    System.out.println(ch[j]);
                    count++;
                }
            }
        }
        System.out.println(count);
        String s="automation";

        for (int i = 0; i <s.length() ; i++) {
            char ch1 =s.charAt(i);
            if(s.indexOf(ch1)==s.lastIndexOf(ch1)){
                System.out.println(ch1);
                break;

            }
        }
    }
}
