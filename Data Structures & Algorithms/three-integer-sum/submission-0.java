class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int ind = 0;ind<nums.length;ind++){
            if(ind>0 && nums[ind]==nums[ind-1]) continue;
        int l = ind+1;
        int r = nums.length-1;
        while(l<r){
            int threeSum = nums[ind]+nums[l]+nums[r];
            if(threeSum > 0) r--;
            else if (threeSum < 0) l++;
            else{
                list.add(Arrays.asList(nums[ind],nums[l],nums[r]));
                l++;
                while(l<r && nums[l]==nums[l-1]){
                    l++;
                }
            }
        }
       
    }
    return list;
}
}
