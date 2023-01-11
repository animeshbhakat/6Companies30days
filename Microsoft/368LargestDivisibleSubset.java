class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        List<Integer> answer = new ArrayList<Integer>();
        if(n == 0){
            return answer;
        }
        Arrays.sort(nums);
        int[] dp = new int[n];
        int max = 1;
        Arrays.fill(dp, 1);
        for(int i =1; i<n; i++){
            for(int j =0; j<i; j++){
                if(nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] +1;
                    max = Math.max(max, dp[i]);
                }
            }
        }

        int prev = -1;
        for(int i = n-1; i>=0; i--){
            if(dp[i] == max && (prev == -1 || prev % nums[i] == 0)){
                answer.add(nums[i]);
                max--;
                prev = nums[i];
            }
        }

        return answer;
    }
}
