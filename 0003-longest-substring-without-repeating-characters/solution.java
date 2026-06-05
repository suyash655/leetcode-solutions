class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
       for(int i=0;i<s.length();i++){
        int[] hash=new int[255];
        Arrays.fill(hash,0);
        for(int j=i;j<s.length();j++){
            if(hash[s.charAt(j)]==1) break;
                hash[s.charAt(j)]=1;
                int len=j-i+1;
                maxlen=Math.max(maxlen,len);


        }

       }
       return maxlen;
        }
       }
