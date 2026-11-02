class Solution {
    // public int removeDuplicates(int[] nums) {
    //     // We used treeset because it is ordered 
    //     TreeSet<Integer> set=new TreeSet<>();
    //     for(int el:nums){
    //         set.add(el);
    //     }
    //     int a=0;
    //     for(int el:set){
    //         nums[a]=el;
    //         a++;
    //     }
    //     // for(int i=set.size();i<nums.length;i++){
    //     //     nums[i]=_;
    //     // }
    //     return a;
    // }

    // Optimal Approach using two pointer 
    public int removeDuplicates(int[] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}