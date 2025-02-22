import java.util.*;

public class SubstringConcatenation {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }
        
        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Build the frequency map for the words array
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Try every possible starting index within the word length to cover all possible shifts
        for (int i = 0; i < wordLen; i++) {
            int left = i;
            int right = i;
            Map<String, Integer> currentMap = new HashMap<>();
            int currentCount = 0;

            while (right + wordLen <= s.length()) {
                // Get the word at the current position
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                // If the word is in the list of words
                if (wordCount.containsKey(word)) {
                    currentMap.put(word, currentMap.getOrDefault(word, 0) + 1);
                    currentCount++;

                    // If we have too many of this word, slide the window to the right
                    while (currentMap.get(word) > wordCount.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        currentMap.put(leftWord, currentMap.get(leftWord) - 1);
                        left += wordLen;
                        currentCount--;
                    }

                    // If we have found a valid concatenation, add the index to the result
                    if (currentCount == words.length) {
                        result.add(left);
                    }
                } else {
                    // Reset the window if the word is not part of the list
                    currentMap.clear();
                    currentCount = 0;
                    left = right;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SubstringConcatenation solution = new SubstringConcatenation();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        
        List<Integer> result = solution.findSubstring(s, words);
        System.out.println(result); // Output: [0, 9]
    }
}
