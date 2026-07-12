class MinStack {
    private int top;
    private int[] stack;
    private int[] minStack;

    public MinStack() {
        stack = new int[30000];
        minStack = new int[30000];
        top = -1;
    }
    
    public void push(int val) {
        top++;
        stack[top] = val;
        if (top == 0) {
            minStack[top] = val;
        } else {
            minStack[top] = Math.min(val, minStack[top - 1]);
        }
    }
    
    public void pop() {
        if (top >= 0) {
            top--;
        }
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        return minStack[top];
    }
}