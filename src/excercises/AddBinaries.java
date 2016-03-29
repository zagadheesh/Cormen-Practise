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
public class AddBinaries {

    public static void main(String[] args) {
        int[] a = {0, 0, 0, 1, 0, 0, 1, 1};
        int[] b = {0, 0, 1, 1, 1, 1, 1, 0};

        AddBinaries bin = new AddBinaries();
        int[] add = bin.add(a, b);
        for (int i = 0; i < add.length; i++) {
            System.out.print("\t" + add[i]);
        }
        System.out.println("");
    }

    public int[] add(int[] a, int[] b) {
        int[] c = new int[a.length + 1];

        int len = c.length;

        int lastOpBit = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int fBit = a[i];
            int sBit = b[i];

            int resBit = lastOpBit + fBit + sBit;

            if (resBit == 2) {
                lastOpBit = 1;
                resBit = 0;
            } else if (resBit == 3) {
                lastOpBit = 1;
                resBit = 1;
            } else {
                lastOpBit = 0;
            }

            c[i + 1] = resBit;

        }
        c[0] = lastOpBit;

        return c;
    }

}
