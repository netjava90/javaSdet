package pavanpackage;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Welcome To Java and selenium";

        /*String [] words = str.split(" "); //split the phrase into words

        String reversString ="";

        for(String w:words){

            String reversword ="";

            for(int i = w.length()-1; i>=0; i--){
                reversword=reversword+w.charAt(i);
            }
            reversString=reversString+reversword+" ";
        }
        System.out.println(reversString);*/

        String [] words = str.split(" ");
        String reversString =" ";
        for(String w:words){
            String reversword =" ";
            for(int i = w.length()-1; i>=0; i--){
                reversword = reversword + w.charAt(i);
            }
            reversString = reversString + reversword+" ";
        }
        System.out.println(reversString);
    }
}
