class MyStack {
     Queue<Integer> hr;
    public MyStack() {
        hr=new LinkedList<>();
    }
    
    public void push(int x) {
        hr.add(x);
        for(int i=0;i<hr.size()-1;i++){
            int temp=hr.poll();
            hr.add(temp);
        }
    }
    
    public int pop() {
        return hr.poll();
    }
    
    public int top() {
        return hr.peek();
    }
    
    public boolean empty() {
        return hr.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */