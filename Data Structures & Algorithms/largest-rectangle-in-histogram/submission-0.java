class Solution {
    private int maxArea;
    private int n;
    
    public int largestRectangleArea(int[] height) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = height.length;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : height[i];

            while (!stack.isEmpty() && currentHeight < height[stack.peek()]) {
                int ht = height[stack.pop()];
                int wt;

                if (stack.isEmpty()) {
                    wt = i;
                } else {
                    wt = i - stack.peek() - 1;
                }

                int area = ht * wt;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
