package pavanpackage;

import java.util.HashSet;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        String arr [] = { "c" , "c++", "python", "java"};

        //approach1
        /*boolean flag = false;
        for(int i = 0; i < arr.length; i++){
           for(int j = i+1; j < arr.length; j++){
               if(arr[i]==arr[j]){
                   System.out.println("found the duplicate element:" +arr[i]);
                   flag=true;
               }
           }
        }
        if(flag == false){
            System.out.println("duplicate element not found");
        }*/

        HashSet <String> langs = new HashSet<>();
        /*System.out.println(langs.add("java"));
        System.out.println(langs.add("python"));
        System.out.println(langs.add("java"));*/

        boolean flag = false;

        for( String l :arr){
            if(langs.add(l)==false){
                System.out.println("found duplicate element:" + l);
                flag = true;
            }
        }
        if(flag==false){
            System.out.println("duplicates not found");
        }
    }

}
