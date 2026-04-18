class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dict = {}
        list = [[] for i in range (len(nums)+1)]

        for num in nums:
            dict[num] = 1+dict.get(num,0)
        
        for ke,v in dict.items():
            list[v].append(ke)
        
        res = []
        for i in range(len(list)-1, 0, -1):
            for n in list[i]:
                res.append(n)
                if len(res) == k:
                    return res