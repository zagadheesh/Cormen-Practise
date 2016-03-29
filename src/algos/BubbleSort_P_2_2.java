/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algos;

import util.Util;

/**
 *
 * @author jagadeesh.t
 */
public class BubbleSort_P_2_2 {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 25, 47, 36, 4};

        sort(arr);

        Util.display(arr);
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int j = arr.length - 1;
            while (j > i) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                j--;
            }

        }
    }

}
