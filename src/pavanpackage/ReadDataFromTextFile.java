package pavanpackage;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {

        //approach 1: file reader and buffer reader
        /*FileReader fileReader = new FileReader("C:\\Users\\sayma\\Idea-project\\alex-youtuber\\src\\pavanpackage\\Factorial.java");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str;

        while((str = bufferedReader.readLine())!= null){
            System.out.println(str);
        }
        bufferedReader.close();*/

       //approach 2
        File file = new File("C:\\\\Users\\\\sayma\\\\Idea-project\\\\alex-youtuber\\\\src\\\\pavanpackage\\\\Factorial.java");
        Scanner sc = new Scanner(file);

        //loop statement
        /*while(sc.hasNextLine()){
            System.out.println(sc.nextLine());*/

        //approach 3

        sc.useDelimiter("\\z");
        System.out.println(sc.next());

        }
    }


