class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        // m=3,n=3, but nums1.length =6 so take care of that 
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){

                nums3[k]=nums1[i];
                i++;k++;
            }
            else{
                
                nums3[k]=nums2[j];
                j++;k++;
            }
        }
        while(i<m){
            nums3[k]=nums1[i];
            i++;k++;
        }
        while(j<n){
            nums3[k]=nums2[j];
            j++;k++;
        }
        for(int x=0;x<nums3.length;x++){
            nums1[x]=nums3[x];
        }
    }
}