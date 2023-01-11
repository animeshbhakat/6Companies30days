class Solution {
    public int maxRotateFunction(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        int F = 0;

        for(int i =0; i<n; i++){
            F += nums[i]*i;
            sum += nums[i];
        }

        int max = F;
        for(int p = n -1; p >= 0; p--){
            
            F = F + sum - n * nums[p];
            max = Math.max(max, F);

        }

        return max;
    }
}
