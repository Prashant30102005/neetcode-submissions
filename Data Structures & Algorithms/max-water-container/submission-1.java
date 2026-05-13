class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int i = 0;
        int j = heights.length-1;
        while(i<j){
            if(heights[i]<heights[j]){
                int sum = (j-i)*heights[i];
                res = Math.max(sum,res);
                i++;
            }
            else{
                int sum = (j-i)*heights[j];
                res = Math.max(sum,res);
                j--;
            }
        }
        return res;
    }
}
