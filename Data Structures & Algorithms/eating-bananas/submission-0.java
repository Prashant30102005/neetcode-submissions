class Solution {
    public static boolean isOk(int[] pile, int h,int s){
        int res = 0;
        for(int i = 0;i<pile.length;i++){
            res += (pile[i]+s-1)/s; 
        }
        return res<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i = 1;i<piles.length;i++){
            if(max<piles[i]){
                max = piles[i];
            }
            
        }
        int l = 1;
        int r = max;
        int ans = max;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isOk(piles,h,mid)){
                ans = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
}
