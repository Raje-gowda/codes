package capmat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AAAAAAA {
    public static void main(String[] args){
        String s1="RA12je34go56wda78";
        char ch[] =s1.toCharArray();
        int sum=0;
        int count =0;

        for (int i=0; i <s1.length() ; i++) {
            if(Character.isDigit(ch[i])) {
                sum = sum + Character.getNumericValue(ch[i]);
            }
        }
        for(char a:s1.toCharArray()){
            if(Character.isDigit(a)){
                count=count+Character.getNumericValue(a);
            }
        }
        System.out.println(count);
System.out.println(sum);
        Pattern cap= Pattern.compile("[A-Z]"); // ["a-z]"   "[//d+]"
        Matcher capmatch = cap.matcher(s1);

        while (capmatch.find()){
            System.out.println(capmatch.group());
        }


        // print longer wold

        String name = "india is my country";
        String[] words = name.split(" ");
        String longWord="";
        for(String word:words){
            if(word.length()>longWord.length()){
                longWord=word;
            }
        }


}




}
