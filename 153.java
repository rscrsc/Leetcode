class Solution {
    private boolean isSorted(int[] nums, int l, int r){
        return nums[l] <= nums[r];
    }
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        if(nums.length == 2){
            return nums[0] < nums[1] ? nums[0] : nums[1];
        }
        while(l <= r){
            int mid = (l+r) / 2;
            if(r - l == 1){
                return nums[r];
            }
            if(isSorted(nums, l, mid)){
                if(isSorted(nums, mid, r)){
                    return nums[0];
                }else{
                   l = mid;
                }
            }else{
                r = mid;
            }
        }
        return -1;
    }
}