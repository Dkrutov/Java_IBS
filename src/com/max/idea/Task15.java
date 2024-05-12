package com.max.idea;

import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        int[] array1 = new int[] {1,2,4,5};
        int[] array2 = new int[] {3,3,4};
        int[] array3 = new int[] {2,3,4,5,6};
        for (int i=0;i<array1.length;i++) {
            int c = 0;
            int a = array1[i];
            for (int j=0;j<array2.length;j++) {
                if (array2[j] == a) {
                    for (int k=0;k<array3.length;k++) {
                        if (array3[k] == a) {
                        c=a;
                    }
                }
            }

        }
            if (c!=0) {
                System.out.println("Решение: " + c);
            }
    }

}
}
