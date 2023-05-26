package pavanpackage;

public class CountEvenAndOddDigits {
    public static void main(String[] args) {

        int num = 61234;
        int evenCount = 0;
        int oddCount = 0;

        while(num>0)
        {
            int rem = num%10;

            if(rem%2==0)
            {
                evenCount++;
            }
            else{
                oddCount++;
            }
            num = num/10;
        }
        System.out.println("number of even numbers: " +evenCount);
        System.out.println("number of odd numbers: " +oddCount);
    }
}
