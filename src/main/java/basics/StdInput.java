package basics;

import java.util.Scanner;

public class StdInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);

        sc.close();
    }
}

