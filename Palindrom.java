import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int rem,temp,rev=0;
        temp = x;
        while(x>0){
            rem = x % 10;
            rev = (rev*10)+rem;
            x = x/10;
        }
        if(x<0){
            StringBuilder revm = new StringBuilder(rev);
            revm.append("-");
        }
        if(rev==temp ){
            return true;
        }
        return false;
    }
}
