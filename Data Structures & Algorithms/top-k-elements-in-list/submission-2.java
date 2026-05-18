class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->{
            return map.get(a) - map.get(b);
        });
        for(int i :map.keySet()){
            queue.add(i);
            if(queue.size()>k){
                queue.poll();
            }
        }
        int[] res = new int[k];
        for(int i = 0;i<k;i++ ){
            res[i] = queue.poll();
        }
        return res;
    }
}
