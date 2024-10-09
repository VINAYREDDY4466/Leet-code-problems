class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenation in both orders gives the same result
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find GCD of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());
        
        // Return the substring of str1 from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper method to calculate GCD of two numbers
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
