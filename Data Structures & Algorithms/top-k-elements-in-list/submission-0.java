class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] list = new List[nums.length+1];
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int i:map.keySet()){
            int f = map.get(i);
            if(list[f]==null){
                list[f] = new ArrayList<>();
            }
            list[f].add(i);
        }
        int[] res = new int[k];
        int c = 0;
        for(int i = list.length-1;i>=0&&c<k;i--){
            if(list[i]!=null){
                for(Integer n:list[i]){
                    res[c++] = n;
                }
            }
        }
        return res;
    }
}
