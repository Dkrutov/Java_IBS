package com.max.idea;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст:");
        String str = in.nextLine();
        char[] en = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] arrayWord = str.split(" ");
        int sumWord = 0;
        for (int i = 0; i < arrayWord.length; i++) {
            int sumSym = 0;
            int numSym = arrayWord[i].length();
            String sword = arrayWord[i].toLowerCase();
            for (int j = 0; j < numSym; j++) {
                char sym = sword.charAt(j);
                for (int k = 0; k < en.length; k++) {
                    if (sym == en[k]) {
                        sumSym+=1;
                    }
                }
            }
            if (sumSym == numSym) {
                sumWord+= 1;
                System.out.println("\n " + (i + 1) + " слово только на латинице: " + arrayWord[i]);
            }
        }
        System.out.println("Число слов латиницей = " + sumWord);
    }
}
