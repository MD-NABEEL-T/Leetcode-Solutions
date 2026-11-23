// Brute force using two pointer
// T.C is O(2n) similar to n but 
// S.C is O(n)
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int[] nums3=new int[m+n];
//         int i=0;
//         int j=0;
//         int k=0;
//         // m=3,n=3, but nums1.length =6 so take care of that 
//         while(i<m && j<n){
//             if(nums1[i]<nums2[j]){

//                 nums3[k]=nums1[i];
//                 i++;k++;
//             }
//             else{
                
//                 nums3[k]=nums2[j];
//                 j++;k++;
//             }
//         }
//         while(i<m){
//             nums3[k]=nums1[i];
//             i++;k++;
//         }
//         while(j<n){
//             nums3[k]=nums2[j];
//             j++;k++;
//         }
//         for(int x=0;x<nums3.length;x++){
//             nums1[x]=nums3[x];
//         }
//     }
// }

// Optimal solution is O(1)
class Solution{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){nums1[k]=nums1[i];i--;}
            else{nums1[k]=nums2[j];j--;}
            k--;
        }
        
    }
}