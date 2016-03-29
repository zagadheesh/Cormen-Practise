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
public class InsertionSort1 {

    public static void main1(String[] args) {
        int[] srcArr = {1, 5, 2, 3, 6, 4};
        InsertionSort1 sort = new InsertionSort1();
        sort.sort(srcArr);

        for (int t : srcArr) {
            System.out.print(t + "\t");
        }
    }

    public static void main(String[] args) {
        int[] srcArr = {3, 1, 2, 4, 7, 6, 5};

        sortWithBinarySearch(srcArr);

        Util.display(srcArr);
    }

    public static void sortWithBinarySearch(int[] srcArr) {
        for (int i = 1; i < srcArr.length; i++) {
            int t = srcArr[i];
            int j = i - 1;

            int index = getIndexByBinarySearch(srcArr, 0, j, t);

            while (j >= index) {
                srcArr[j + 1] = srcArr[j];
                j--;
            }

            srcArr[j + 1] = t;

            System.out.println("---------key=" + t + ",j=" + j + ",i=" + i + ",index=" + index);
            Util.display(srcArr);

        }
    }

    public void sort(int[] srcArr) {
        for (int i = 1; i < srcArr.length; i++) {
            int t = srcArr[i];
            int j = i - 1;
            while (j >= 0 && srcArr[j] > t) {
                srcArr[j + 1] = srcArr[j];

                j--;
            }
            srcArr[j + 1] = t;
        }
    }

    public static int getIndexByBinarySearch(int[] arr, int low, int high, int ele) {

        if (high <= low) {
            return ele < arr[low] ? low : low + 1;
        }

        int mid = (low + high) / 2;

        if (ele == arr[mid]) {
            return mid;
        } else if (ele < arr[mid]) {
            return getIndexByBinarySearch(arr, low, mid - 1, ele);
        }

        return getIndexByBinarySearch(arr, mid + 1, high, ele);
    }

}
