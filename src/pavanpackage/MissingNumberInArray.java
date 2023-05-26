package pavanpackage;

public class MissingNumberInArray {
    public static void main(String[] args) {

        //should not have duplicate.
        //order does not matter
        //values have some range
        int[] a = {1, 2, 3, 4, 5, 7, 8, 9, 10};

        //1+2+4+5=12 sum1
        //1+2+3+4+5=15 sum2
        //sum2-sum1=3
        int sum1 = 0;
        for(int i=0; i<a.length; i++ ){
            sum1 = sum1 + a[i];
        }
        System.out.println("sum of elements in array : " +sum1);

        int sum2 = 0;
        for(int i=1; i<=10; i++){
            sum2 = sum2 + i;
        }
        System.out.println("sum of element in the range 1 to 5 : "+sum2);
        System.out.println("missing number is : " + (sum2-sum1));
    }

}
