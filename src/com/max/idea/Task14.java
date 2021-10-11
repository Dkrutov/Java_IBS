package com.max.idea;
import java.util.Random;
public class Task14 {
    public static void main(String[] args) {
        int array1[] = new int[15];
        for (int i=0;i<15;i++) {
            Random random = new Random();
            int a = random.nextInt(41);
            int b = a - 20;
            array1[i]=b;
        }
        for (int i=0;i<15;i++) {
            System.out.print(" " + array1[i] + ", ");
        }
        int max=array1[0];
        int min=array1[0];
        for (int i=0;i<15;i++) {
            if (array1[i]>max) {
                max=array1[i];
            }
            if (array1[i]<min) {
                min=array1[i];
            }
        }
        System.out.println("\nМаксимальный элемент массива = " + max);
        System.out.println("Минимальный элемент массива = " + min);
        int absMax = Math.abs(max);
        int absMin = Math.abs(min);
        int result = Math.max(absMax,  absMin);
        System.out.println("Максимальный элемент по модулю = " + result);
    }
}
