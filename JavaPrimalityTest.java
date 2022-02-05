// https://www.hackerrank.com/challenges/java-primality-test/problem

//probably prime
//Returns true if this BigInteger is probably prime, false if it's definitely composite. If certainty is ≤ 0, true is returned.

import java.math.BigInteger;
import java.util.*;

public class JavaPrimalityTest {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //String n = scanner.nextLine();
        BigInteger n = scanner.nextBigInteger();
        if(n.isProbablePrime(100)) {
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
