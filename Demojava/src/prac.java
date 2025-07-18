import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.NavigableMap;

public class prac {
    public static void main(String[] args) {
    String name="Cheluvaraju";
    String ove="AEIOUaeiou";

    for(char ch:ove.toCharArray()){
        if(name.indexOf(ch)!=-1){
            System.out.println(ch);
        }
    }
    }
}