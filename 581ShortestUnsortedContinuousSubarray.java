class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int start = 0;
        int end = nums.length-1;
        for(int i = 0; i<nums.length; i++){
            if(arr[i] == nums[i]){
                start++;
            }
            else{
                break;
            }
        }
        for(int i = nums.length-1; i>start; i--){
            if(arr[i] == nums[i]){
                end--;
            }
            else{
                break;
            }
        }
        return end - start +1;
    }
}
