class Solution {
    public String reverseVowels(String s) {
       char[] chars = s.toCharArray();
        int t = s.length() - 1;
        int i = 0;
        
        // Two-pointer approach to reverse vowels
        while (i < t) {
            char c1 = chars[i];
            char c2 = chars[t];
            
            if (!isVowel(c1)) {
                i++;
            } else if (!isVowel(c2)) {
                t--;
            } else {
                // Swap the vowels
                char temp = chars[i];
                chars[i] = chars[t];
                chars[t] = temp;
                
                // Move both pointers
                i++;
                t--;
            }
        }
        // Convert the modified char array back to a string
        return new String(chars);
    }

    // Helper function to check if a character is a vowel
    public boolean isVowel(char c) {
        c = Character.toLowerCase(c); // To handle both uppercase and lowercase vowels
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    }
