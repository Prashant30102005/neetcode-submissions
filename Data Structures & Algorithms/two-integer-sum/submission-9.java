class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        } 
        for(int i =0;i<nums.length-1;i++){
            int j = target-nums[i];
            if(map.containsKey(j)&&map.get(j)!=i){
                res[0] = i;
                res[1] = map.get(j);
                return res;
            }
        }
        return res;
    }
}
