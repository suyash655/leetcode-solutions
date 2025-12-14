class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // even length: x == reversed
        // odd length:  x == reversed / 10 (ignore middle digit)
        return x == reversed || x == reversed / 10;
    }
}

