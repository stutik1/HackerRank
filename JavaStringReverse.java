// https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.util.*;
public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String B= new StringBuilder(A).reverse().toString();
        if(A.equals(B)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    //////// Method 2///////
    /*
   public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";
        for(int i=A.length()-1;i>=0;i--) {
            B = B+A.charAt(i);
        }
        if(A.equals(B)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }  */

    //////// Method 3 ///////
/*
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer b= new StringBuffer();
        String B= new StringBuffer(A).reverse().toString();
        if(A.equals(B))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    */
}
