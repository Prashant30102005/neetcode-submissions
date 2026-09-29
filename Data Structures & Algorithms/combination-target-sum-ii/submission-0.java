class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public void backtrack(List<Integer> ans,int target,int[] nums,int pos){
        if(target == 0){
            list.add(new ArrayList<>(ans));
            return;
        }
        if(target<0||pos>=nums.length)return;
        ans.add(nums[pos]);
        backtrack(ans,target-nums[pos],nums,pos+1);
        ans.remove(ans.size()-1);
        while(pos<nums.length-1&&nums[pos+1]==nums[pos]){
            pos++;
        }
        backtrack(ans,target,nums,pos+1);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> ans = new ArrayList<>();
        backtrack(ans,target,candidates,0);
        return list;
    }
}
