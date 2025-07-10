public class CountCharacter {

     public static void main(String[] args) {

        String s="BHYRAPPA";
        
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            int count =0;

            for (int j = 0; j <s.length() ; j++) {
                if(s.charAt(j)==ch){
                    count++;
                }
            }

            if (s.indexOf(ch)==i){
                System.out.println(ch+" = "+ count);
            }
        }

    }
}
