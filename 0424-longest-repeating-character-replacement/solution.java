import java.util.HashMap;
import java.util.Map;

class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int i = 0; // Left pointer
        int j = 0; // Right pointer
        int maxFreq = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {
            char rightChar = s.charAt(j);
            // Add current character to map
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            
            // Update maxFreq to be the highest frequency of any single character seen so far
            maxFreq = Math.max(maxFreq, map.get(rightChar));

            // Check if current window is invalid
            // Window Size = (j - i + 1)
            // Replacements needed = Window Size - maxFreq
            if ((j - i + 1) - maxFreq > k) {
                // ❌ FIX: Remove character at LEFT pointer (i), not j
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                i++; // Shrink window from left
                // Do NOT increment j here; we stay at current j to re-evaluate or move next loop
            }
            
            // Update maxLen. 
            // Note: We can update this outside the else because even if we shrunk, 
            // the window size (j-i+1) is now valid or we are just tracking the max seen.
            // Standard pattern often updates maxLen every step:
            maxLen = Math.max(maxLen, j - i + 1);
            
            j++; // Expand window to the right
        }

        return maxLen;
    }
}   
