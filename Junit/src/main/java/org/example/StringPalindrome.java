package org.example;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        if(checkPalindrome(str)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }

    static boolean checkPalindrome(String str) {
        str = str.toLowerCase();
        StringBuilder builder = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            builder.append(str.charAt(i));
        }

        return str.equals(builder.toString());

    }

}
