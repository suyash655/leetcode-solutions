class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));       
        
    }
    private String build(String s){
        Stack<Character> st=new Stack<>();

        for(char c:s.toCharArray()){
            if(c!='#'){
                st.push(c);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }

        StringBuilder sb= new StringBuilder();
        for(char c:st){
            sb.append(c);
        }

        return sb.toString();

    }
}
