// https://www.hackerrank.com/challenges/java-string-compare/problem

import java.util.*;
public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String length = s.substring(0,k);
        String smallest = length;
        String largest = length;

        for(int i=1;i<=s.length()-k;i++) {
            length=s.substring(i,i+k);
            if (length.compareTo(largest) > 0) {
                largest = length;
            }
            if (length.compareTo(smallest) < 0) {
                smallest = length;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
