class MyQueue {
    private Stack<Integer> stack;
    public MyQueue() {
        stack=new Stack<>();
        
        
        
        
    }
    
    public void push(int x) {
        stack.push(x);


        
    }
    
    public int pop() {
      if(stack.size()==1){
        return  stack.pop();
      }
    //store top variable temp
      int top=stack.pop();
      int front=pop();

      stack.push(top);

      return front;
        
    }
    
    public int peek() {
        if(stack.size()==1){
            return stack.peek();
        }

        int front=stack.pop();
        int top=peek();

        stack.push(front);

        return top;
        
    }
    
    public boolean empty() {
       return  stack.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
