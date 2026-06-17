class Solution {
    public long countVowels(String word) {
        long totalSum = 0;
        long currentContribution = 0;
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            
            // If current char is a vowel, it adds (i + 1) new occurrences
            // to all substrings ending at this position
            if (isVowel(c)) {
                currentContribution += (i + 1);
            }
            
            // Add the running contribution to the total
            totalSum += currentContribution;
        }
        
        return totalSum;
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}   
