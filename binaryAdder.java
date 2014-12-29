/**
 * Given two binary strings, return their sum (also a binary string).
 * 
 * https://oj.leetcode.com/problems/add-binary/
 * 
 **/ 

public class Solution {
    public String addBinary(String a, String b) {
        int maxLength = Math.max(a.length(), b.length()) + 1; //one extra carry
        
        
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int currentResult = carry;
            carry = 0; //clear for next round

            int aVal = getValueAtPosFromRight(a, i);
            if (aVal != -1) currentResult += getValueAtPosFromRight(a, i);
            
            int bVal = getValueAtPosFromRight(b, i);
            if (bVal != -1) currentResult += getValueAtPosFromRight(b, i);

            if (currentResult == 0) {
                sb.append("0");
            } else if (currentResult == 1) {
                sb.append("1");
            } else if (currentResult == 2) {
                carry = 1;
                sb.append("0");
            } else if (currentResult == 3) {
                carry = 1;
                sb.append("1");
            }
        }
        String result = sb.reverse().toString();
        return removeLeadingZerosFromBinaryString(result);
    }


    /**
     * remove leading zeros ie. "001" => "1"
     **/
    private String removeLeadingZerosFromBinaryString(String s) {
        StringBuilder sb = new StringBuilder();

        Boolean foundOne = false;
        for (char c : s.toCharArray()) {
            if (foundOne) {
                sb.append(c);
            } else if (c == '1') {
                foundOne = true;
                sb.append(c);
            }
        }
        
        if (sb.length() == 0) sb.append("0");
        return sb.toString();
    }
    
    int getValueAtPosFromRight(String s, int position) {
        int length = s.length();
        if (position >= length) return -1;
        char c = s.charAt(length - position - 1);
        return Character.getNumericValue(c);
    }
}
