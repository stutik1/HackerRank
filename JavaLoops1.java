//https://www.hackerrank.com/challenges/java-loops-i/problem

import java.util.*;

public class JavaLoops1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        for(int i =1; i<=10; i++) {
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}
