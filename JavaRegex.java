// https://www.hackerrank.com/challenges/java-regex/problem

import java.util.*;
import java.util.regex.Pattern;
public class JavaRegex {
public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }
        }
    }
    class MyRegex {
      /*  // \\d{1,2} catches any one or two digit number
        //(0|1)\\d{2} catches any three digit number starting with 0 or 1.
        //2[0-4]\\d catches numbers between 200 and 249.
        //25[0-5] catches numbers between 250 and 255.        */

        String num = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String pattern =num+"."+num+"."+num+"."+num;
    }

