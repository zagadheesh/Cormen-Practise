/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.mergesort;

/**
 *
 * @author jagadeesh.t
 */
public class Test {

    public static void main(String[] args) {
        int[] srcArr = {45, 67, 3, 1, 67, 34, 25, 86, 98, 21, 4, 2, 45, 20, 35, 36, 19, 18, 0};

//        int p = 0;
//        int r = srcArr.length - 1;
//        int q = (p + r) / 2;
//
//        int[] mergedArr = getMergedArr(srcArr, p, q, r);
//
//        for (int n : mergedArr) {
//            System.out.println("n = " + n);
//        }
        srcArr = merge(srcArr, 0, srcArr.length - 1);

        for (int t : srcArr) {
            System.out.println("t = " + t);
        }
    }

    public static int[] merge(int[] srcArr, int l, int r) {

        if (l < r) {
            int m = (l + r) / 2;
            merge(srcArr, l, m);
            merge(srcArr, m + 1, r);
            srcArr = getMergedArr(srcArr, l, m, r);
        }

        return srcArr;

    }

    public static int[] getMergedArr(int[] srcArr, int p, int q, int r) {
//        int[] mergedArr = new int[r - p + 1];
//        int mIndex = 0;

        int fIndex = p;
        int sIndex = q + 1;

        int n1 = q - p + 1;
        int n2 = r - q;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = srcArr[p + i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = srcArr[q + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = p;

        while (i < n1 && j < n2) {
            srcArr[k++] = left[i] < right[j] ? left[i++] : right[j++];
        }

        while (i < n1) {
            srcArr[k++] = left[i++];
        }
        while (j < n2) {
            srcArr[k++] = right[j++];
        }

//        while (fIndex < q + 1 && sIndex <= r) {
////            System.out.println("fIndex = " + fIndex);
////            System.out.println("sIndex = " + sIndex);
//            if (srcArr[fIndex] < srcArr[sIndex]) {
//                mergedArr[mIndex] = srcArr[fIndex++];
//            } else {
//                mergedArr[mIndex] = srcArr[sIndex++];
//            }
//            mIndex++;
//        }
//
//        while (fIndex < q + 1) {
//            mergedArr[mIndex++] = srcArr[fIndex++];
//        }
//
//        while (sIndex <= r) {
//            mergedArr[mIndex++] = srcArr[sIndex++];
//        }
        return srcArr;
    }

}
