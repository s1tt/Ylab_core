package ru.ylab.alekseev_sergei.task1;

public class Main {
    public static void main(String[] args) {
        int[][] array = createAndFillArray(20, 20);

        printArray(array);
        System.out.println("Max Value " + getMaxValue(array));
        System.out.println("Min Value " + getMinValue(array));
        System.out.println("AVG Value " + getAvgValue(array));
    }

    public static int[][] createAndFillArray(int line, int column) {
        int[][] array = new int[line][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = simpleNumberGenerator(1, 100);
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int[] anArr : array) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }

    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int[] number : numbers) {
            for (int j : number) {
                if (j > maxValue) {
                    maxValue = j;
                }
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[][] numbers) {
        int minValue = numbers[0][0];
        for (int[] number : numbers) {
            for (int j : number) {
                if (j < minValue) {
                    minValue = j;
                }
            }
        }
        return minValue;
    }

    public static int getAvgValue(int[][] numbers) {
        int sum = 0;
        int indexCounter = 0;
        for (int[] number : numbers) {
            for (int i : number) {
                sum += i;
                indexCounter++;
            }
        }
        return sum / indexCounter;
    }

    public static int simpleNumberGenerator(int minValue, int maxValue) {
        return (int)((System.nanoTime() / maxValue ^  System.nanoTime()) % maxValue) + minValue;
    }
}
