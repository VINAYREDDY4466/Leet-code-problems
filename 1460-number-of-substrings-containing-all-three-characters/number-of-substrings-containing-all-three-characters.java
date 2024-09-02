class Solution {
    public int numberOfSubstrings(String s) {
       int c = 0;
        int[] count = new int[3]; // To count occurrences of 'a', 'b', 'c'
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            count[s.charAt(r) - 'a']++; // Update count for current character

            // Check if we have all three characters in the current window
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                c += s.length() - r; // Add valid substrings
                count[s.charAt(l) - 'a']--; // Move left pointer
                l++;
            }
        }

        return c;


    }
}