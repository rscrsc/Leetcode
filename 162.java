class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 0;
        }
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int mid = (l+r) / 2;
            if((mid == 0 && nums[0] > nums[1]) || (mid == n-1 && nums[n-1] > nums[n-2]) || (nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1])){
                return mid;
            }else if(nums[mid] > nums[mid+1]){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
}