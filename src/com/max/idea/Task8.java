package com.max.idea;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int sum=0;
        int lengthArray = in.nextInt();
        int[] array1 = new int[lengthArray];
        for (int i=0;i<lengthArray;i++) {
            array1[i]=i+1;
            if (array1[i] % 2 != 0) {
                sum+= array1[i];
            }
        }
        System.out.println("Сумма всех нечетных чисел = " + sum);

    }
}
