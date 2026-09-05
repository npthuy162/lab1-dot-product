/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labproject1;

/**
 *
 * @author thuyphuong
 */
import java.util.Random;
import java.util.Arrays;

public class Lab1DotProduct {
    public static void main(String[] args) {
        int n = 5;

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(10) + 1;
            b[i] = random.nextInt(10) + 1;
        }

        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }

        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
        System.out.println("Array c: " + Arrays.toString(c));
    }
}
