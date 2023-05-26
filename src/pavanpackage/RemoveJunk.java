package pavanpackage;

public class RemoveJunk {
    public static void main(String[] args) {

        String str = "$%#&*(?:_*&^%$ latin string 0123456987";
        str = str.replaceAll("[^a-zA-Z0-9]","" );
        System.out.println(str);

    }
}
