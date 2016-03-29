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
public class BinarySearch {

    /*
    
     Input : Sorted Sequence A and element v
    
     index <-- -1
     mid <-- (1+length[A])/2
     low <-- 1
     high <-- length[A]
     while mid > 0
     do if A[mid-1]=v 
     index <-- mid
			
     else if A[mid-1]>v
			
     high <-- mid-1;
     else
     low <-- mid
			
			
     mid <-- (low+high)/2
     
     */
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 17, 25};
        int index = searchRec(arr, 1, arr.length, 17, (1 + arr.length) / 2);
        System.out.println("index = " + index);
    }

    public static int search(int[] arr, int v) {
        int low = 1;
        int high = arr.length;
        int mid = (low + high) / 2;
        int index = -1;

        while (low <= high) {
            int key = arr[mid - 1];

            if (key == v) {
                index = mid - 1;
                break;
            } else if (key > v) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

            mid = (low + high) / 2;
        }

        return index;

    }

    public static int searchRec(int[] arr, int low, int high, int v, int mid) {

        int key = arr[mid - 1];

        if (low >= high && v != key) {
            return -1;
        } else {

            if (key == v) {
                return mid - 1;
            } else {

                if (key > v) {
                    return searchRec(arr, low, mid - 1, v, (low + mid - 1) / 2);
                } else if (key < v) {
                    return searchRec(arr, mid + 1, high, v, (high + mid + 1) / 2);

                }

            }
        }
        return -1;
    }
}
