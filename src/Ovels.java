import javax.print.DocFlavor;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ovels {
    public static void main(String[] args) {
        String name = "RAJEGOWDA";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'E' || ch == 'R' || ch == 'J') {
                System.out.println(name.charAt(i));
                count++;
            }

        }
        System.out.println(count);

        String s1 = "Rajegowda";
        String s2 = "aeiouAEIOU";
        Set<Character> unicvalue = new LinkedHashSet<>();
        for (char ch : s1.toCharArray()) {
            if (s2.indexOf(ch) != -1) {
                unicvalue.add(ch);

            }
            for (char c : unicvalue) {
                System.out.println(c);
            }
        }
    }
}
