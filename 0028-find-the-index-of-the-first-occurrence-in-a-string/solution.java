class Solution {
    public int strStr(String haystack, String needle) {
        int hsize = haystack.length();
        int nsize = needle.length();
        if (hsize < nsize)return -1;
        for (int i = 0; i <= hsize - nsize; i++) {
            String substr = haystack.substring(i, i + nsize);
            if (substr.equals(needle))return i;
        }
        return -1;
    }
}
