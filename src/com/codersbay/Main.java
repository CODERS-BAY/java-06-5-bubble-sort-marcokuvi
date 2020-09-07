package com.codersbay;

public class Main {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {

                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        int[] unsortedArray = {3, 60, 35, 2, 45, 320, 5};
        bubbleSort(unsortedArray);

        for (int i : unsortedArray) {
            System.out.print(i + " ");
        }
    }
}
