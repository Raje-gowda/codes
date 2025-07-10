public class Reverse_string {
    public static void main(String[] args){
       String s1 = "RAJE_GOWDA";
       String s2 = "";
       String s3 = "word";
        for (int i=s1.length()-1; i>=0; i--) {

            s2= s2+s1.charAt(i);

        }
//        System.out.print(s2);

        s1=s1+s3;
        s3=s1.substring(0,s1.length()-s3.length());
        s1=s1.substring(s3.length());

        System.out.println(s1 );
        System.out.println(s3);
    }
}
