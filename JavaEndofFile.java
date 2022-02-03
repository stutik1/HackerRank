//https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.util.*;

public class JavaEndofFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = 0;
//          while (sc.hasNext()) {
//           n++;
//            System.out.println(n + " " + sc.nextLine());
//        }
        for(int n=1;sc.hasNext()==true ;n++){
              System.out.println(n + " " + sc.nextLine());
        }
    }
}

