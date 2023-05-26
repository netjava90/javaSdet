package pavanpackage;

public class SumOfArray {
    public static void main(String[] args) {

        int a [] = {5, 2, 7, 9, 6};
        int sum = 0;

        //a.length-1
        /*for(int i = 0; i<=4; i++){
            sum = sum + a[i];  //sum is 0, a[i] is 5

        }*/
        //enhanced for loop or for each loop
        for(int value:a){
           sum = sum + value;
        }
        System.out.println("sum of array elements: " +sum);
    }
}
