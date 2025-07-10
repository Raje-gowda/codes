public class ReplaceString {
    public static void main(String[] args) {
        String name = "RAJEGOWDA_Gama";
        int Index = 3;
        char ch = 'f';
        name=name.substring(0,Index)+ch+name.substring(Index+1);

        System.out.println(name);
    }
}
