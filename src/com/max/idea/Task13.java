package com.max.idea;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст:");
        String str = in.nextLine();
        String[] en = {"a", "b", "c"};
        String[] EN = {"A", "B", "C"};
        String[] result = str.split(" ");
        for (int i=0;i<result.length;i++) {
            System.out.println(i + result[i]);
        }
        int sum = 0;
        for (int i=0;i<result.length;i++) {
            for (int j=0;j<en.length;j++) {
            if (result[i].contains(en[j])) {
                sum+=1;
                System.out.println( (i+1) + " Латинское слово: " + result[i]);
                break;
            }
            }
        }
        System.out.println("Число латинских слов= " + sum);
    }
}
