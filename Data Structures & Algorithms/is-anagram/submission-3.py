class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sArr = [0] * 26
        for c in s:
            sArr[ord(c)-ord('a')]+=1
        for c in t:
            sArr[ord(c)-ord('a')]-=1
        for i in sArr:
            if i!= 0: return False
        return True