import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
import java.util.Collections;
import java.util.NavigableMap;

public class Main {
    public static void main(String[] args) {

        String name = "RAJEGOWDA";
        int count =0;
        String check="";
        boolean flag=false;

        for (int i = 0; i <name.length(); i++) {
            char ch=name.charAt(i);
            if(check.indexOf(ch)==-1) {
                if(name.indexOf(ch)!=name.lastIndexOf(ch)){
                    System.out.println(ch);
                    flag=true;
                    break;
                }
                check+=ch;
            }

        }
        if(!flag){
            System.out.println("-");
        }


    }
}