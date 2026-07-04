class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            
           if(st.isEmpty()||c!=st.peek()){
            st.push(c);
          }else if(c==st.peek()){
           
            st.pop();

          
        }
        }

        StringBuilder sb=new StringBuilder();

        for(char c:st){
            sb.append(c);

        }
        return sb.toString();

        
    }
}
