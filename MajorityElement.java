/**

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

https://oj.leetcode.com/problems/majority-element/

**/

public class Solution {
    public int majorityElement(int[] num) {
        int candidate = Integer.MAX_VALUE;
        int count = 0;
        for (int i : num) {
            if (i == candidate) {
                count++;
            } else if (count == 0) {
                candidate = i;
                count = 1;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
