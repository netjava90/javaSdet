package pavanpackage;

import java.util.Arrays;

public class CheckArrayEquals {
    public static void main(String[] args) {

        int a1 [] = {1,3,2,4,5};
        int a2 [] = {1,2,3,4,5};

        //approach 1
       /* boolean status = Arrays.equals(a1,a2);
        if(status==true){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Array are not equal");
        }*/

        //approach 2
        boolean status = true;
        if(a1.length == a2.length){
            //compare rest of element
            for(int i=0; i<a1.length; i++){
                if (a1[i] != a2[i]) {
                    status = false;
                }
            }
        }
        else{
            status=false;
        }
        if(status==true){
            System.out.println("arrays are equal");
        }else{
            System.out.println("arrays are not equal");
        }
    }
}
