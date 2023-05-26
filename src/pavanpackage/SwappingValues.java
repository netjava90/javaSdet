package pavanpackage;

public class SwappingValues {
    public static void main(String[] args) {

        int a = 10, b = 20;
        System.out.println("before swapping the values are "+a+" "+b);


        //logic 1
//        int temp;
//        temp = a;
//        a = b;
//        b = temp;

//        System.out.println("values after swapping are "+a+" "+b);
//        System.out.println("value of a is : "+a);
//        System.out.println("value of b is : "+b);

        //logic 2 - and + without third variable

//        a=a*b;    //a=a+b
//        b=a/b;    //b=a-b
//        a=a/b;    //a=a-b


        //logic4 bitwise XOR (^)
//        a=a^b;
//        b=a^b;
//        a=a^b;


        System.out.println("values after swapping are.."+a+" "+b);
    }
}
