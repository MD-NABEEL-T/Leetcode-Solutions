class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int n=nums.length;
        while(i<n-1){
            if(n==1){
                if(target>nums[0]){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            if(nums[i]<target && target<=nums[i+1]){
                return i+1;
            }
            i++;
        }
        if(target>nums[n-1]){
            return n;
        }
        return 0;
    }
}