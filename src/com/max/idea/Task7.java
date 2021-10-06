package com.max.idea;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int lengthArray = in.nextInt();
        int[] array1 = new int[lengthArray];
        for (int i=0;i<lengthArray;i++) {
            System.out.println("Введите " + i + " элемент массива");
            array1[i]=in.nextInt();
        }
        System.out.println("Массив заполнен!");
        for (int i=0;i<lengthArray;i++) {
            System.out.println("" + i + " элемент= " + array1[i]);
        }
        int x=1;
        int y=2;
        int z=3;
        for (int name : array1) {
            if (name == x || name == y || name == z) {
                System.out.println(name + " - Данное значение имеется в константах");
            }
        }
        System.out.println("Конец");
    }
}
