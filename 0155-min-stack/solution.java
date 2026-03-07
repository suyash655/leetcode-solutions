class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minstack;

    public MinStack() {
         stack= new ArrayDeque<>();
         minstack=new ArrayDeque<>();
        
    }
    
    public void push(int val) {
        stack.push(val);

        if(minstack.isEmpty()||val<=minstack.peek()){
            minstack.push(val);
        }
        
    }
    
    public void pop() {
        int a=stack.pop();
        if(minstack.peek()==a){
            minstack.pop();
        }
        
        
    }
    
    public int top() {
        int a=stack.peek();
        return a;
        
    }
    
    public int getMin() {
       int m=minstack.peek();
       return m;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
