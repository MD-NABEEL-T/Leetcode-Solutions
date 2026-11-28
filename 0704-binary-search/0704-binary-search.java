// method 1 using looping 
// class Solution {
//     public int search(int[] nums, int target) {
//         int n=nums.length;
//         int low=0;
//         int high=n-1;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(nums[mid]==target) return mid;
//             else if(target<nums[mid]) high=mid-1;
//             else if(target>nums[mid]) low=mid+1;
//         }
//         return -1;
//     }
// }

//method 2 using recursion
// in merge sort we dont return something so we didnt write return but here we have to for every call
class Solution {
    public int binSearch(int[] nums,int low,int high,int target){
        int mid=(low+high)/2;
        if(low>high) return -1;
        else if(target==nums[mid]){
            return mid;
        }
        else if(target<nums[mid]){
            return binSearch(nums,low,mid-1,target);
        }
        // (target>nums[mid])
        else{
            return binSearch(nums,mid+1,high,target);
        }
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        return binSearch(nums,low,high,target);
    }
}