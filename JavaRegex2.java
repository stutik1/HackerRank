// https://www.hackerrank.com/challenges/duplicate-word/problem

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class JavaRegex2 {
    public static void main(String[] args) {

/*\w ----> A word character: [a-zA-Z_0-9]
\W ----> A non-word character: [^\w]
\b ----> A word boundary
\1 ----> Matches whatever was matched in the 1st group of parentheses, which in this case is the (\w+)
        + ----> Match whatever it's placed after 1 or more times
                */
        String regex = "\\b(\\w+)(\\s+\\1\\b)*";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0), m.group(1));
            }
            // Prints the modified sentence.
            System.out.println(input);
        }
    }
}
