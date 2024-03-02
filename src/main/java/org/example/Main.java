package org.example;
/* 1 уровень сложности: Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
Массив 1 - 100 112 256 349 770
Массив 2 - 72 86 113 119 265 445 892
к = 7
Вывод: 256
Окончательный отсортированный массив -
72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
7-й элемент этого массива равен 256. */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        System.out.println(resArray(arr1, arr2, 7));
    }

    private static int resArray(int[] arr1, int[] arr2, int k) {
        int[] arrResult = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, arrResult, arr1.length, arr2.length);
        Arrays.sort(arrResult);
        int result = 0;
        for (int i = 0; i < arrResult.length; i++) {
            if (i == k) {
                result = arrResult[i - 1];
            }
        }
        return result;
    }
}