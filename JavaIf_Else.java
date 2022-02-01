// https://www.hackerrank.com/challenges/java-if-else/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaIf_Else {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String a;
        if((n&1)==1)a = "Weird";
        else
        {
            if(n>=2 && n<=5)a = "Not Weird";
            else if(n>=5 && n<=20)a="Weird";
            else a = "Not Weird";
        }
        System.out.println(a);
    }
}
