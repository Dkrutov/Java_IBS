package com.max.idea;
import java.util.Arrays;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число строк массива:");
        int lengthArrayX = in.nextInt();
        System.out.println("Введите число столбцов массива:");
        int lengthArrayY = in.nextInt();
        double[][] array2 = new double[lengthArrayX][lengthArrayY];
        for (int i=0;i<lengthArrayX;i++) {
            for (int j=0;j<lengthArrayY;j++) {
                System.out.println("Введите " + i +", "+ j +" элемент массива");
                array2[i][j]=in.nextDouble();
            }
        }
        System.out.println(Arrays.deepToString(array2));
            for (int j=0;j<lengthArrayY;j++) {
                System.out.println( 0 +" "+ j +" элемент массива * 3 = " + array2[0][j]*3);
            }

    }
}

