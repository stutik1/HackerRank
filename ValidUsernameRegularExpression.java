// https://www.hackerrank.com/challenges/valid-username-checker/problem

import java.util.*;
public class ValidUsernameRegularExpression {
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";   //$----> represent end with alphanumeric
}
 class Solution {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(ValidUsernameRegularExpression.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
