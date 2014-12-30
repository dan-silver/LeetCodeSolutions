/**
 * 
 * https://oj.leetcode.com/problems/single-number/
 * 
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * 
 * Solution: iterate through the array using the exclusive xor bit operator.  The second number
 * will reverse the outcome of the first, so the odd number will be left over.
 * 
 **/

public class Solution {
    public int singleNumber(int[] A) {
        int num = 0;
        for (int x : A) num ^= x;
        return num;
    }
}
