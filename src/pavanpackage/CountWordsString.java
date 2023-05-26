package pavanpackage;

import java.util.Scanner;

public class CountWordsString {
    public static void main(String[] args) {

        System.out.println("enter a string");

        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        int count = 1;

        for(int i = 0; i<s.length()-1; i++)
        {
           if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
               count++;
            }
        }
        System.out.println("number of words in this string : "+ count);



    }
}
