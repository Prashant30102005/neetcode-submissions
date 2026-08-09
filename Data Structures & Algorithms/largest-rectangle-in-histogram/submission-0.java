class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        for(int i = 0;i<n;i++){
            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty())left[i] = -1;
            else left[i] = stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i = n-1;i>=0;i--){
            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty())right[i] = n;
            else right[i] = stack.peek();
            stack.push(i);
        }
        int res = 0;
        for(int i = 0;i<n;i++){
            res = Math.max(res,(right[i]-left[i]-1)*heights[i]);
        }
        return res;
    }
}
