class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        // we know in math n=(n*(n+1))/2;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int expectedSum=(n*(n+1))/2;
        return expectedSum-sum;
    }
}