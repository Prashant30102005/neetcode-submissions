class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<k;i++){
            pq.add(nums[i]);
        }
        list.add(pq.peek());
        int left = 0;
        for(int right = k ;right<nums.length;right++){
            
            pq.add(nums[right]);
            pq.remove(nums[left++]);
            list.add(pq.peek());
        }
        int[] res = new int[list.size()];
        for(int i = 0 ;i<res.length;i++){
            res[i]= (int)list.get(i);
        }
        return res;
    }
}
