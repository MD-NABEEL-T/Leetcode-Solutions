// Brute is using sort function 
// Time Complexity is O(2n) Better Solution
// class Solution {

//     public void sortColors(int[] nums){
//         int zero=0;
//         int one=0;
//         int two=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0){
//                 zero++;
//             }
//             else if(nums[i]==1){
//                 one++;
//             }
//             else{
//                 two++;
//             }
//         }
//         for(int i=0;i<zero;i++){
//             nums[i]=0;
//         }
//         for(int i=zero;i<zero+one;i++){
//             nums[i]=1;
//         }
//         for(int i=zero+one;i<zero+one+two;i++){
//             nums[i]=2;
//         }
//     }
// }

// Optimal Solution is Dutch National Flag theorem.
class Solution{
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
        }

    }
}