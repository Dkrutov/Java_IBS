package com.max.idea;
import java.util.Scanner;
public class FinalTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод параметров уравнения:");
        String str = in.nextLine();
        System.out.println("Ввод: " + str);
        char s1 = str.charAt(0);
        char s2 = str.charAt(1);
        char s3 = str.charAt(2);
        char s4 = str.charAt(3);
        char s5 = str.charAt(4);
        int a = Character.getNumericValue(s3);
        System.out.println("a=" + a);
        if (s4=='=') {
            if (s2 == '+') {
                if (s1 == 'x') {
                    int z3 = Character.getNumericValue(s3);
                    int z5 = Character.getNumericValue(s5);
                    int x = z5 - z3;
                    System.out.println("X=" + x);
                } else if (s3 == 'x') {
                    int z1 = Character.getNumericValue(s1);
                    int z5 = Character.getNumericValue(s5);
                    int x = z5 - z1;
                    System.out.println("X=" + x);
                } else if (s5 == 'x') {
                    int z1 = Character.getNumericValue(s1);
                    int z3 = Character.getNumericValue(s3);
                    int x = z1 + z3;
                    System.out.println("X=" + x);
                } else {
                    System.out.println("Не введен \"X\"!!!");
                }
            } else if (s2 == '-') {
                if (s1 == 'x') {
                    int z3 = Character.getNumericValue(s3);
                    int z5 = Character.getNumericValue(s5);
                    int x = z5 + z3;
                    System.out.println("X=" + x);
                } else if (s3 == 'x') {
                    int z1 = Character.getNumericValue(s1);
                    int z5 = Character.getNumericValue(s5);
                    int x = z1 - z5;
                    System.out.println("X=" + x);
                } else if (s5 == 'x') {
                    int z1 = Character.getNumericValue(s1);
                    int z3 = Character.getNumericValue(s3);
                    int x = z1 - z3;
                    System.out.println("X=" + x);
                } else {
                    System.out.println("Не введен \"X\"!!!");
                }
            } else  {
                System.out.println("Введен некорректный знак операции \"+\" или \"-\"!!!");
            }
        } else {
            System.out.println("Не введен знак \"=\"!!!");
        }
    }
}


