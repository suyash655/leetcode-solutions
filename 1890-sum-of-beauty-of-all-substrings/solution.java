class Solution {
    private int minfreq(int[] freq){
        int a=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                a=Math.min(a,freq[i]);
            }
        }
        return a;
     }
     private int maxfreq(int[] freq){
        int a=0;
        for(int i=0;i<26;i++){
            
                a=Math.max(a,freq[i]);
            
        }
        return a;
     }
    public int beautySum(String s) {
        
    
        int sum=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int total=maxfreq(freq)-minfreq(freq);
                
                sum+=total;
            }
           
            
        }
       
        return sum;
    }
    
}
