class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        for i,a in enumerate(nums):
            if target-a in map:
                return [map[target-a],i]
            map[a] = i
        return []