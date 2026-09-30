class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public void backtrack(int[] nums,List<Integer> set,int n){
        if(n>=nums.length){
            list.add(new ArrayList<>(set));
            return;
        }
        set.add(nums[n]);
        backtrack(nums,set,n+1);
        set.remove(set.size()-1);
        while(n+1<nums.length&&nums[n]==nums[n+1]){
            n++;
        }
        backtrack(nums,set,n+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,new ArrayList<Integer>(),0);
        return list;    
    }
}
