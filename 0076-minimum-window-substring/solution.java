class Solution {
    public String minWindow(String s, String t) {
        if(t==null||s==null||t.length()>s.length()){
            return "";
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        int left=0;
        int right=0;
        int cnt=t.length();
        int startindex=0;
        int minlength=Integer.MAX_VALUE;
        while(right<s.length()){
            char c=s.charAt(right);
            if(map.containsKey(c) && map.get(c)>0){
                cnt--;
            }
            map.put(c,map.getOrDefault(c,0)-1);
            right++;


            while(cnt==0){

                if(right-left<minlength){
                    minlength=right-left;
                    startindex=left;


                }
               char cleft=s.charAt(left);
               map.put(cleft,map.getOrDefault(cleft,0)+1);

               if(map.get(cleft)>0){
                cnt++;
               }
               left++;

               


            }

        }
        return minlength==Integer.MAX_VALUE ? "":s.substring(startindex,startindex+minlength);
        
       
    }
}
