class Solution {
    public int revNumber(int num){
        int temp = 0;
        while(num >0){
            int remainder = num%10;
            temp = (temp*10) + remainder;
            num = num/10;
        }
        return temp;
    }
    public int countNicePairs(int[] nums) {
        int count = 0, mod =(int) 1e9 +7;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int rev1 = revNumber(nums[i]);
            int v = map.getOrDefault(nums[i] - rev1, 0);
            map.put(nums[i] - rev1, v+1);
            count = (count + v)%mod;
        }
        return count;
    }
}
