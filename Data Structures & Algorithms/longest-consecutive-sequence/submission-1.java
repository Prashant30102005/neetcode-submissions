class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            int j = nums[i]-1;
            int k = 1;
            while(set.contains(j)){
                k++;
                j--;
            }
            max = Math.max(max,k);
        }
        return max;
    }
}
