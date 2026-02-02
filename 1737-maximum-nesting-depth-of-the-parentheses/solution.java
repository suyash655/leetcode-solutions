class Solution {
    public int maxDepth(String s) {

        int m=s.length();
        int cnt=0;
        int n=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            if(s.charAt(i)== '('){
            cnt++;
            }
           if(s.charAt(i)== ')'){
            cnt--;
           }
             n=Math.max(n,cnt);
        }

        return n;
        
    }
}
