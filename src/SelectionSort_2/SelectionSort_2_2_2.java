/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectionSort_2;

/**
 *
 * @author jagadeesh.t
 */
public class SelectionSort_2_2_2 {

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 0, 9, 8, 3, 1};
        SelectionSort_2_2_2 ss = new SelectionSort_2_2_2();
        ss.sort(arr);
        ss.display(arr);
    }

    public void display(int[] arr) {
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            int b = arr[i];
            System.out.print(b + "\t");
        }
        System.out.println("");
    }

    public void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];

            int smallIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[smallIndex]) {
                    smallIndex = j;
                }

            }
            arr[i] = arr[smallIndex];
            arr[smallIndex] = temp;
        }

    }

    /*
    
     pseudocode
    
     SELECTION-SORT(A)
     for i <-- 1 to length[A]
     do temp <-- A[i]
     j <--  i
     smallIndex <-- j;
     while j < length[A]
        if A[j] < A[smallIndex]
             smallIndex <-- j
     A[i]=A[smallIndex];
     A[smallIndex]=temp
    
    
     */
}
