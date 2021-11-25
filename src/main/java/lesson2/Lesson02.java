package lesson2;

import java.util.Arrays;

public class Lesson02 {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        fillDiagonal();
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void fillArray() {
        int[] array = new int[8];
        for (int i = 0, j = 0; i < array.length; i++, j += 3) {
            array[i] = j;
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();
    }

    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (i < 6) {
                w[i] = w[i] * 2;
            }
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==j)
                arr[i][j] = 1;
                arr[i][4 - i - 1] = 1;

                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }