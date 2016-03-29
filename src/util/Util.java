/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author jagadeesh.t
 */
public class Util {

    public static void display(int[] arr) {
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            int b = arr[i];
            System.out.print(b + "\t");
        }
        System.out.println("");
    }

}
