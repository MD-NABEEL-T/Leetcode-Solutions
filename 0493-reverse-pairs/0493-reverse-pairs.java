// i<j
// nums[i] > 2 * nums[j]
// Brute Force solution
// near about T.C O(n^2)

// class Solution {
//     public int reversePairs(int[] nums) {
//         int n=nums.length;
//         int counter=0;
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]>2*nums[j]){counter++;}
//             }
//         }
//         return counter;
//     }
// }

// leetcode this problem ,then ml and aptitude
class Solution {
    
    void merge(int arr[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int k=0;
        int temp[]=new int[high-low+1];
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                left++;
            }
            else{
                temp[k]=arr[right];
                right++;
            }
            k++;
        }
        while(left<=mid){
            temp[k]=arr[left];
            left++;k++;
            }
        while(right<=high){
            temp[k]=arr[right];
            right++;k++;
        }
        for(int i=0;i<temp.length;i++){
            arr[low+i]=temp[i];
        }
    }
    int countInversion(int arr[],int low,int mid,int high){
        int left=low;
        int right =mid+1;
        int count=0;
        for(int i=left;i<=mid;i++){
            while(right<=high && arr[i]>2L*arr[right]){
                right++;
            }
            count=count+(right-(mid+1));
        }
        return count;
    }
    int mergeSort(int arr[],int low,int high){
        if(low >= high) return 0;
        int count=0;
        int mid=(low+high)/2;
        count+=mergeSort(arr,low,mid);
        count+=mergeSort(arr,mid+1,high);
        count+=countInversion(arr,low,mid,high);
        merge(arr,low,mid,high);
    return count;
    }
    public int reversePairs(int[] nums) {
        int n=nums.length;
        int result=mergeSort(nums,0,n-1);
        return result;
    }
}