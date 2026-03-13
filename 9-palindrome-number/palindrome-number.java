
class Solution {
    public boolean isPalindrome(int x) {
        int reversedNum = 0;
        int temp = x;

        while (temp > 0) {
            int lastdigit = temp % 10;
            reversedNum = reversedNum * 10 + lastdigit;
            temp = temp / 10;

        }
        return x == reversedNum;
        
    }
}