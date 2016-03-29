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
public class AddBinaries1 {

    public static void main(String[] args) {
        AddBinaries1 binar1 = new AddBinaries1();
        binar1.add(0, 1);
    }

    public void add(long bin1, long bin2) {
        int[] result = new int[20];
        int i = 0;
        long rem = 0;
        while (bin1 != 0 || bin2 != 0) {
            long mod1 = bin1 % 10;
            long mod2 = bin2 % 10;

            long div1 = bin1 / 10;
            long div2 = bin2 / 10;

            rem = (mod1 + mod2 + rem) % 2;

            result[i++] = (int) rem;

            bin1 = div1;
            bin2 = div2;
        }

        if (rem != 0) {
            result[--i] = (int) rem;
        }

        System.out.println("");
        for (int j = 0; j < result.length; j++) {
            int s = result[j];

            
            System.out.print(s);

        }

    }

}
