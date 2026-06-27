class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int len = num.length();
        for(int i=0; i<len/2; i++){
            if(num.charAt(i) != num.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}