class Solution {
    public int divide(int dividend, int divisor) {
        int q=0;
        if(divisor!=0){
            q = dividend/divisor;
        }
        if(dividend==-2147483648 && divisor==-1){
            // System.out.println("2147483647");
            return 2147483647;
        }
        return q;
    }
}
