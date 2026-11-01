class Solution {
    // public void rotate(int[] nums, int k) {
    //     List<Integer> list=new ArrayList<>();
    //     int n=nums.length;
    //     k=k%n;
    //     for(int i=n-k;i<n;i++){
    //         list.add(nums[i]);
    //     }

    //     for(int i=n-k-1;i>=0;i--){
    //         nums[i+k]=nums[i];
    //     }
    //     for(int i=0;i<k;i++){
    //         nums[i]=list.get(i);
    //     }
    // }
    
    // what we do here is kind of fun
    //[1,2,3,4,5,6,7] k=3

    //reverse in two parts like :
    //[4,3,2,1]  [7,6,5]
    // then reverse the entire one
    // [5,6,7,1,2,3,4]
    public void reverseArr(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums,int k){
        int n=nums.length;
        k=k%n;
        reverseArr(nums,0,n-k-1);
        reverseArr(nums,n-k,n-1);
        reverseArr(nums,0,n-1);
    }
}