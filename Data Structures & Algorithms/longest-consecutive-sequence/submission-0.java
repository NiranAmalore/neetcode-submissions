class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int count = 1;    
            while(set.contains(i+count)){
                count++;
            }
            longest = Math.max(count,longest);
            }
        }
      return longest;
    }
}
