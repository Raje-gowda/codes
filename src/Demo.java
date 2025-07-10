import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.zip.CheckedInputStream;

public class Demo {
    public static void main(String[] args) {
        String s1="Rajegow12da";
        int count =0;

        for (int i = 0; i <s1.length() ; i++) {
            if(Character.isUpperCase(s1.charAt(i))){
                count++;
            }
        }
        System.out.println(count);

    }
}


