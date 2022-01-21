package ru.gb;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 1, 4, 4, 1, 4};
        new Main().method2(array);
    }

    public int[] method1(int[] array) {

        int helper = 0;
        boolean key = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                key = false;
            }
        }

        for (int i = 0; i < array.length; i++) {

            if (key == true) {
                throw new RuntimeException();
            }

            if (array[(array.length - 1) - i] != 4 || (array[(array.length - 1) - i] == 8)) {
                helper++;
            } else {
                break;
            }

        }
        int[] arrayToReturn = new int[helper];
        for (int i = 0; i < helper; i++) {

            arrayToReturn[i] = array[((array.length - 1) - helper + 1) + i];
        }
        System.out.println(Arrays.toString(arrayToReturn));
        return arrayToReturn;
    }


    public boolean method2(int[] array) {
        boolean bool = false;
        //{  4,4,4,4,4,5}
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 4) {
                if (array[i] != 4) {
                    bool = true;

                }
            }
        }
        System.out.println(bool);
        return bool;
    }
}

