class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<position.length;i++){
            map.put(position[i],speed[i]);
        }
        List<Integer> positions = new ArrayList<>(map.keySet());
        Collections.sort(positions, Collections.reverseOrder());
        Stack<Double> fleets = new Stack<>();

        for(int pos: positions){
            int speedy = map.get(pos);
            double time = (double)(target - pos) / speedy;
            if(fleets.isEmpty() || time>fleets.peek()){
                fleets.push(time);
            }
        }
    return fleets.size();
    }
}
