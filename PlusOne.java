// problem no 66 on leetcode
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i =digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
            }
        int[] res = new int[digits.length+1];
        for(int i =0;i<res.length;i++){
            if(i==0){
                res[i]=1;
                }
            else{
                res[i]=0;
                }
            }
        return res;
        }
    }
