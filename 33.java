class Solution {
    public int findTurningPoint(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                return i;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int turningPoint = findTurningPoint(nums);
        int[] mapTable = new int[nums.length];
        int[] mapTableInv = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i <= turningPoint){
                mapTable[i] = (i+nums.length) - (turningPoint+1);
            }else{
                mapTable[i] = i - (turningPoint+1);
            }
        }
        for(int i = 0; i < nums.length; i++){
            mapTableInv[mapTable[i]] = i;
        }
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int mid = (l+r) / 2;
            if(nums[mapTableInv[mid]] == target){
                return mapTableInv[mid];
            }else if(target > nums[mapTableInv[mid]]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }
}