// https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.util.*;
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if(s.length()==0) {
            System.out.println(0);
        }
        String[]words=s.split("[^A-Za-z]+");
        System.out.println(words.length);
        for(String word : words ) {
            System.out.println(word);
        }
    }
}
