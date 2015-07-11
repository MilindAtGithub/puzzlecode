/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milind.sum.contiguous.subarray;

/**
 *
 * @author milind
 */
public class SumContigousSubarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int arr[] = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        int temp = new SumContigousSubarray().maxSum(arr);
        System.out.println("Max: " + temp);
        arr = new int[]{-2, -3, -4, -1, -2, -1000, -5, -3};
        temp = new SumContigousSubarray().maxSum(arr);
        System.out.println("Max: " + temp);
    }

    /**
     * Algorithm doesn't work for all negative numbers. It simply returns 0 if
     * all numbers are negative. For handling this we can add an extra phase
     * before actual implementation. The phase will look if all numbers are
     * negative, if they are it will return maximum of them (or smallest in
     * terms of absolute value). There may be other ways to handle it though.
     *
     * @param input
     * @return
     */
    public int maxSum(int input[]) {

        int maxSoFar = 0;
        int maxEnding = 0;
        for (int i = 0; i < input.length; i++) {
            maxEnding = maxEnding + input[i];
            // Now Check if MaxEnding is less than zero then max ending is zero
            if (maxEnding < 0) {
                maxEnding = 0;
            } // Update the maximum So far if it is less than max ending
            else if (maxSoFar < maxEnding) {
                maxSoFar = maxEnding;

            }

        }
        return maxSoFar;
    }
}
