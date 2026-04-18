class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> list[] = new ArrayList[nums.length+1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(list[entry.getValue()]==null) list[entry.getValue()] = new ArrayList<>();
            if(list[entry.getValue()]!=null) list[entry.getValue()].add(entry.getKey());
        }
        int arr[] = new int[k];
        int index = 0;
        for(int i = list.length-1; i>=0 && k>0; i--){
            if(list[i]!=null){
                for(int j: list[i]){
                    arr[index++] = j;
                    k--;
                }
            }
        }
        return arr;
    }
}
