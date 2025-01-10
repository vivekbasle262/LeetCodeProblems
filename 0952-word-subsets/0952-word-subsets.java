import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        
        // Step 1: Build the max frequency map for words2
        Map<Character, Integer> word2Map = new HashMap<>();
        
        // Iterate over all words in words2 to get the max frequency of each character
        for (String word : words2) {
            Map<Character, Integer> tempMap = new HashMap<>();
            for (char c : word.toCharArray()) {
                tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
            }
            // Update the word2Map to have the maximum frequency for each character
            for (Map.Entry<Character, Integer> entry : tempMap.entrySet()) {
                word2Map.put(entry.getKey(), Math.max(word2Map.getOrDefault(entry.getKey(), 0), entry.getValue()));
            }
        }

        // Step 2: Check each word in words1
        for (String word : words1) {
            Map<Character, Integer> word1Map = new HashMap<>();
            for (char c : word.toCharArray()) {
                word1Map.put(c, word1Map.getOrDefault(c, 0) + 1);
            }
            
            boolean isSubset = true;
            // Check if the word1Map satisfies the condition of being a superset of word2Map
            for (Map.Entry<Character, Integer> entry : word2Map.entrySet()) {
                char c = entry.getKey();
                int requiredCount = entry.getValue();
                if (word1Map.getOrDefault(c, 0) < requiredCount) {
                    isSubset = false;
                    break;
                }
            }
            
            // If the word satisfies the condition, add it to the result
            if (isSubset) {
                result.add(word);
            }
        }

        return result;
    }
}
