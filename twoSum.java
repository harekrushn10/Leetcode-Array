class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int sum=0;
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                int sum=nums[i] + nums[j];
                if(target==sum){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
