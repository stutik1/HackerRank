// https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array1= new int[n];
        for(int i=0;i<n;i++){
            array1[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=array1[j]+sum;
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
