package ru.ylab.alekseev_sergei.task2;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 6, 3, 2, 5, 1, 4, 9};

        sort(array);
        assert test(array);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }

    public static boolean test(int[] array) {
        boolean result = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static void sort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
