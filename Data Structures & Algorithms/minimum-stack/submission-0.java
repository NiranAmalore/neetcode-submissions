class MinStack {
    Stack<Integer> stack = null;
    Stack<Integer> minstack = null;
    public MinStack() {
       stack = new Stack<>();
       minstack = new Stack<>(); 
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.size()!=0){
            val = Math.min(minstack.peek(),val);
        }
        minstack.push(val);
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
