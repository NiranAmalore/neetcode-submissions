class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            char start = s.charAt(l);
            char end = s.charAt(r);
            if (start>='A' && start<='Z') start += 32;
            if (end>='A' && end<='Z') end += 32;
            if(!isCorrect(start)) l++;
            else if(!isCorrect(end)) r--;
            else {
                if(start!=end) return false;
                l++;
                r--;
            }
        }
        return true;
    }

    public static boolean isCorrect(char c){
        if((c>='a' && c<='z')||(c>='0' && c<='9')){
            return true;
        }
        else return false;
    }
}
