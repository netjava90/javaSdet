package pavanpackage;

public class MaxAndMinNumInArray {
    public static void main(String[] args) {
      int a [] = {50,30, 40, 20,60};
        int max = a [0];
        for(int i = 1; i<a.length; i++){
            if(a[i]>max);{
                max = a [i];
            }
        }
        System.out.println("maximum element in the array is : "+max);

        int b [] = {50, 100, 40, 20, 60};
        int min = b [0];
        for(int i = 1; i < b.length; i++ ){
            if (b[i]<min){
              min = b[i];
            }
        }
        System.out.println("minimum element in the array is : "+min);

    }
}
