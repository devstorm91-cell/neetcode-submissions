class Solution {
    private int top;
    private int[] stack;

    public int[] dailyTemperatures(int[] temperatures) {
        top = -1;
        int n = temperatures.length;
        stack = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            while (top != -1 && temperatures[i] > temperatures[stack[top]]) {
                int prevIndex = pop();
                result[prevIndex] = i - prevIndex;
            }
            push(i);
        }
        return result;
    }

    public void push(int elem) {
        stack[++top] = elem;
    }

    public int pop() {
        int elem = stack[top--];
        return elem;
    }
}