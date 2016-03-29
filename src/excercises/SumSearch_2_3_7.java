/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercises;

/**
 *
 * @author jagadeesh.t
 */
public class SumSearch_2_3_7 {

    public static void main(String[] args) {
        
        //guessing that we already merged a set using merge sort/insertion by binary search whose worst case is O(nlogn)
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int found = isExistSimpler(arr, 10);
        System.out.println("found = " + found);
    }

    public static int isExistSimpler(int[] arr, int key) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == key) {
                return 1;
            } else if (sum < key) {
                i++;
            } else {
                j--;
            }
        }

        return 0;
    }

    public static int isExists(int[] arr, int x) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            int diff = x - key;
            if (diff == 0) {
                return 1;
            } else if (diff > 0) {
                int index = binarySearch(arr, 0, j, diff);
                if (index != -1) {
                    return 1;
                }
            }
        }

        return 0;
    }

    public static int binarySearch(int[] arr, int low, int high, int key) {

        if (high <= low && arr[low] != key) {
            return -1;
        }

        int mid = (low + high) / 2;
        int ele = arr[mid];

        if (ele == key) {
            return mid - 1;
        } else {
            if (ele < key) {
                return binarySearch(arr, mid + 1, high, key);
            } else {
                return binarySearch(arr, low, mid - 1, key);
            }
        }

    }

}
