class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        LUT = [0] * 26
        for c in s:
            LUT[ord(c)-ord('a')]+=1
        for c in t:
            LUT[ord(c)-ord('a')]-=1
        for i in LUT:
            if i!=0:
                return False
        return True