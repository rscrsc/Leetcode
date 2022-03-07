class Solution {
    public int findl(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int mid = (l+r) / 2;
            if(target > nums[mid]){
                l = mid + 1;
            }else if(target <= nums[mid]){
                r = mid - 1;
            }
        }
        if(l < nums.length && nums[l] == target){
            return l;
        }else{
            return -1;
        }

    }
    public int findr(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int mid = (l+r) / 2;
            if(target >= nums[mid]){
                l = mid + 1;
            }else if(target < nums[mid]){
                r = mid - 1;
            }
        }
        if(l > 0 && nums[l-1] == target){
            return l - 1;
        }else{
            return -1;
        }
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            int[] res = {-1, -1};
            return res;
        }
        int[] res = {findl(nums, target), findr(nums, target)};
        return res;
    }
}