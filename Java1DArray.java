// https://www.hackerrank.com/challenges/java-1d-array-introduction/problem

import java.util.*;
public class Java1DArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a=new int[n];
        for (int i=0;i<n;i++) {
            a[i]=scan.nextInt() ;
            System.out.println(a[i]);
        }
    }
}
