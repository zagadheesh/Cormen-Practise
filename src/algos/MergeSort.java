/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algos;

/**
 *
 * @author jagadeesh.t
 */
public class MergeSort {

    static int count = 0;

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = {102,6, 1, 3, 8, 0, 2, 3, 3, 101, 99, 23};
        ms.merge(arr, 1, arr.length);
        ms.display(arr);

        System.out.println("total steps :: " + count);
    }

    public void merge(int[] arr, int p, int r) {

        if (p < r) {
            int q = (p + r) / 2;
            merge(arr, p, q);
            merge(arr, q + 1, r);
            merge(arr, p, q, r);
            count++;
        }

    }

    public void merge(int[] arr, int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[p + i - 1];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[q + i];
        }

        int i = 0;
        int j = 0;
        int k = p - 1;
        for (; k < r && i < n1 && j < n2; k++) {

            if (left[i] < right[j]) {
                arr[k] = left[i++];
            } else {
                arr[k] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }

    }

    public void display(int[] arr) {
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            int b = arr[i];
            System.out.print(b + "\t");
        }
        System.out.println("");
    }

}
