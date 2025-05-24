class Solution {
    public int reverse(int x) {
        int rem,rev=0;
        // int INT_MAX =2147483647;
        // int INT_MIN =-2147483648;
            while(x>0 || x<0){
            rem = x%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev = (rev*10)+rem;
            x = x/10; 
        } 
        return rev;
    }
}
