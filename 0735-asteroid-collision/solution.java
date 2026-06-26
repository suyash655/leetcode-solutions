class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      Stack<Integer> st=new Stack<>();

      for(int i:asteroids){
        if(i>0){
            st.push(i);
        }else{



            boolean survive =true;
            while(!st.isEmpty() && st.peek()>0){
                if(st.peek()<-i){
                    st.pop();
                    

                }else if( st.peek()==-i){
                    st.pop();
                    survive=false;
                    break;

                }else{
                    survive =false;
                    break;
                }
            }
               


            if(survive){
                    st.push(i);
                }

        }
      }

      int[] arr=new int[st.size()];
      for(int i=arr.length-1;i>=0;i--){
        arr[i]=st.pop();
      }
      return arr;
        
    }
}
