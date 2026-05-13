class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet set = new HashSet<>();
        int ans = 0;
        for(int i:nums){
            set.add(i);
        }
        for(int i:nums){
            int j = i;
            int k = 1;
            while(set.contains(j-1)){
                j--;
                k++;
            }
            ans = Math.max(k,ans);
        }
        return ans;
    }
}
