import java.util.HashSet;
import java.util.Set;

public class Pract {
    
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 1, 2};
        Set<Integer> num = new HashSet<>();

        for (int a : ar) {
            if (!num.add(a)) {
                System.out.println(a);
            }

        }
    }
}






