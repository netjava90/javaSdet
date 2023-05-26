package pavanpackage;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        System.out.println("Enter the third number");
        int c = sc.nextInt();

        //approach one
        /* if(a>b && a>c){
            System.out.println(a+ " is the largest number");
        } else if (b>a && b>c) {
            System.out.println(b+ " is the largest number");
        }else{
            System.out.println(c+ " is the largest number");
        }*/

        //ternary operator in java
//        int largest1 = a>b?a:b; //largest of a and b
//        int largest2 = c>largest1?c:largest1; //largest of c and largest1

        int largest = c>(a>b?a:b)?c:(a>b?a:b);

        System.out.println(largest+ " is the largest number");
    }
}
