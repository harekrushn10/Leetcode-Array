import java.util.*;
class Solution {
    public int mySqrt(int x) {
       if(x>0){
        double n=Math.sqrt(x);
        int no=(int)n;
        return no;
       }
       return 0;
    }

}
