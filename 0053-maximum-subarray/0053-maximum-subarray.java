// [-2,1,-3,4,-1,2,1,-5,4]
// brute force solution or better solution
// T.C is O(n^2)
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maximum=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum=sum+nums[j];
//                 if(sum>maximum){maximum=sum;}
//             }
            
//         }
//         return maximum;
//     }
// }


//optimal solution
//KADANE's ALGORITHM
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){return nums[0];}
        int maximum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maximum){
                    maximum=sum;
                }

            if(sum<0){sum=0;}
            // else if(sum>0){


            // }
        }
        return maximum;

    }
}