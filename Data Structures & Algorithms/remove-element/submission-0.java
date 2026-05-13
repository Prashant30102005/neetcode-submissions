class Solution {
    public int removeElement(int[] nums, int val) {
       int j = 0;
       int i = 0;
       int k = 0;
       while(j<nums.length){
        if(nums[j]!=val){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            k++;
        }
        j++;
       }
       return k;
    }
}