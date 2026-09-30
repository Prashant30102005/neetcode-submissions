class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public void backtrack(int[] nums,List<Integer> set,boolean[] used){
        if(set.size()>=nums.length){
            list.add(new ArrayList<>(set));
        }
        for(int j = 0;j<nums.length;j++){
            if(!used[j]){
                set.add(nums[j]);
                used[j] = true;
                backtrack(nums,set,used);
                set.remove(set.size()-1);
                used[j] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtrack(nums,new ArrayList<Integer>(),used);
        return list;
    }
}
