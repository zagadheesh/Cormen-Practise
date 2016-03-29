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
public class RecursiveInsertion_2_3_4 {

    public static void main(String[] args) {
        int[] arr = {100, 1, 50, 2, 63, 2, 2, 2, 1};
        sort(arr, arr.length - 1);
//        RecursiveInsertionSort(arr, arr.length);
        Util.display(arr);

    }

    public static void sort(int[] arr, int index) {
        if (index >= 0) {
            sort(arr, index - 1);

            int key = arr[index];
            int i = index - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;

            }
            arr[i + 1] = key;

//            System.out.println("----index " + index + "---------");
//            Util.display(arr);
        }

    }

}
