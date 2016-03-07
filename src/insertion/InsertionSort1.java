/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion;

/**
 *
 * @author jagadeesh.t
 */
public class InsertionSort1 {

    public static void main(String[] args) {
        int[] srcArr = {1, 5, 2, 3, 6,4};
        InsertionSort1 sort=new InsertionSort1();
        sort.sort(srcArr);
        
        for (int t : srcArr) {
            System.out.print(t+"\t");
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

}
