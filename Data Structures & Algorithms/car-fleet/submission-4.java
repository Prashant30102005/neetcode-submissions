class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] cars = new double[speed.length][2];
        for(int i = 0;i<speed.length;i++){
            cars[i][0] = position[i];
            cars[i][1] = (double)(target-position[i])/(double)speed[i];
        }
        Arrays.sort(cars,(a,b)->Double.compare(b[0],a[0]));
        Stack<Double> stack = new Stack<>();
        for(int i = 0;i<speed.length;i++){
            if(!stack.isEmpty()&&stack.peek()>=cars[i][1]){
                continue;

            }
            stack.push(cars[i][1]);
        }
        return stack.size();
    }
}
