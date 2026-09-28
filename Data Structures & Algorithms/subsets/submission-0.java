class Solution {
    public void backtrack(int[] nums,int n,List<List<Integer>> list,List<Integer> subset){
        if(n==nums.length){
            list.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[n]);
        backtrack(nums,n+1,list,subset);
        subset.remove(subset.size()-1);
        backtrack(nums,n+1,list,subset);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtrack(nums,0,list,subset);
        return list;
    }
}
