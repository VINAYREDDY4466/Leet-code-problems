class Solution{
public List<List<String>> groupAnagrams(String[] strs) {
    // This list will store the final grouped anagrams
    List<List<String>> ans = new ArrayList<>();

    // This HashMap will map sorted anagram strings to their corresponding group index in 'ans'
    HashMap<String, Integer> hm = new HashMap<>();

    // Iterate through each string in the input array
    for (int i = 0; i < strs.length; i++) {
        // Get the current string
        String currString = strs[i];

        // Convert the current string to a character array
        char[] charArray = currString.toCharArray();

        // Sort the characters in the array (anagrams will have the same sorted order)
        Arrays.sort(charArray);

        // Create a new string from the sorted character array
        String sortedString = new String(charArray);

        // Check if the sorted string already exists in the HashMap
        if (hm.containsKey(sortedString)) {
            // Found an existing anagram group based on the sorted string
            int groupIndex = hm.get(sortedString); // Get the group index for the existing anagram group
            List<String> group = ans.get(groupIndex); // Access the existing anagram group from 'ans'
            group.add(currString); // Add the current string to the existing group
        } else {
            // No existing anagram group found for the sorted string
            // Create a new anagram group
            List<String> newGroup = new ArrayList<>();
            newGroup.add(currString); // Add the current string as the first element of the new group
            ans.add(newGroup); // Add the newly created group to the final list 'ans'
            hm.put(sortedString, ans.size() - 1); // Store the sorted string as a key in the HashMap, mapping it to its new group index
        }
    }

    // Return the list of grouped anagrams
    return ans;
}
}