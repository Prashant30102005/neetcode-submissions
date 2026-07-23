class Solution {
    public int trap(int[] height) {
        int res = 0;
        int l = 0;
        int r = height.length-1;
        int lm = 0;
        int rm = 0;
        while(l<=r){
            if(lm<=rm){
                lm = Math.max(lm,height[l]);
                res += lm - height[l];
                l++;
            }
            else{
                rm = Math.max(rm,height[r]);
                res += rm - height[r];
                r--;
            }
        }
        return res;
    }
}
