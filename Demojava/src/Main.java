import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        String name="Bhyrappa";
        int count =0;
        char[] ch1=name.toCharArray();


        for (char ch:ch1) {
            for (int j = 0; j <name.length() ; j++) {
                if(name.indexOf(ch)!=name.lastIndexOf(ch)){
                    count++;
                    break;
                }
            }
            if(count==1){
                System.out.println(ch);
            }
        }
        if(count==0){
            System.out.println("-");
        }
    }
}