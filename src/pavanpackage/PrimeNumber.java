package pavanpackage;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        //the number has to be > 1
        //and has only two factors 1 and itself

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println("Enter a number");
        int num = 35;
        int count = 0;

        if (num>1)
        {
            for(int i=1; i<=num; i++)
            {
                if(num % i == 0)
                    count++;
            }
            if(count==2){
                System.out.println("this number is a prime number");
            }
            else{
                System.out.println("not a prime number");
            }
            }
        else{
            System.out.println("this is not a prime number");
        }
    }
}
