class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         HashMap<Character, Integer> ans = new HashMap<>();
        for (char s : ransomNote.toCharArray()) {
            ans.put(s, ans.getOrDefault(s, 0) + 1);
        }

        // Map to store frequency of characters in magazine
        HashMap<Character, Integer> ans2 = new HashMap<>();
        for (char s : magazine.toCharArray()) {
            ans2.put(s, ans2.getOrDefault(s, 0) + 1);
        }

        // Check if each character in ransomNote is present in magazine
        for (Map.Entry<Character, Integer> entry : ans.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            
            // If the character is not in magazine or not enough occurrences, return false
            if (!ans2.containsKey(key) || ans2.get(key) < value) {
                return false;
            }
        }

        return true;

    }
}