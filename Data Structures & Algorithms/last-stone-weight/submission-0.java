class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);
        for(int i:stones){
            heap.add(i);
        }
        while(heap.size()>1){
            int x = heap.poll();
            int y = heap.poll();
            heap.add(x-y);
        }
        return heap.peek();
    }
}
