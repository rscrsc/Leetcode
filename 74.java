class Solution {
    private int[] convertIndex(int m, int n, int index){
        return new int[]{index/n, index%n};
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = m * n - 1;
        while(l <= r){
            int mid = (l+r) / 2;
            int[] midd = convertIndex(m, n, mid);
            if(matrix[midd[0]][midd[1]] == target){
                return true;
            }else if(target > matrix[midd[0]][midd[1]]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return false;
    }
}