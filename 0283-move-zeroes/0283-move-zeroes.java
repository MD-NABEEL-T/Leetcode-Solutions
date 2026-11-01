class Solution {

    // FIRST APPROACH = brute force
    // public void moveZeroes(int[] nums) {
    //     List<Integer> list=new ArrayList<>();
    //     int n=nums.length;
    //     for(int i:nums){
    //         if(i!=0){
    //             list.add(i);
    //         }
    //     }
    //     for(int i=0;i<list.size();i++)
    //     {
    //         nums[i]=list.get(i);
    //     }
    //     for(int i=list.size();i<n;i++){
    //         nums[i]=0;
    //     }
    // }

    // SECOND APPROACH = optimal -> Two Pointer 
    public void moveZeroes(int[] nums){
        int n=nums.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
                }
        }
        if(j==-1) return;
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}