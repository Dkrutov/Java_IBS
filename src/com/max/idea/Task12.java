package com.max.idea;
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст: \"I like Java!!!\" :");
        String str = in.nextLine();
        if ( str.contains("Java")&str.startsWith("I like")&str.endsWith("!!!")) {
            System.out.println(str.toUpperCase());
            String str2 = str.replace('a',  'o');
            System.out.println(str2.substring(7,11));
        } else {
            System.out.println("Вы совершили ошибку");
        }
    }
}
