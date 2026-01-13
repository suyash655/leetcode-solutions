class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);//sorts the string lexiographically
        StringBuilder str=new StringBuilder();
       int  n=strs.length;
       String m=strs[0];
       String k=strs[n-1];
      
       

        for(int i=0;i<Math.min(m.length(),k.length());i++){
            
           
            if(m.charAt(i)!=k.charAt(i)){
            break;
                
            }
            str.append(m.charAt(i));
            


           


        }

        return  str.toString();
    }
}
