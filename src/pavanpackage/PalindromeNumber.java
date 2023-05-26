package pavanpackage;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num = scan.nextInt();
        int orgNum = num;

        int rev = 0;
        while (num != 0){
            rev=rev * 10 + num % 10;
            num = num / 10;
        }
        //System.out.println("Reverse Number is:"+ rev);

        if(orgNum==rev){
            System.out.println(orgNum+" palindrome Number");
        }else System.out.println(orgNum+" is not a palindrome Number");
    }
}
