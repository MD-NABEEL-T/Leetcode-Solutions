class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int el:nums){
            set.add(el);
        }
        int a=0;
        for(int el:set){
            nums[a]=el;
            a++;
        }
        // for(int i=set.size();i<nums.length;i++){
        //     nums[i]=_;
        // }
        return a;
    }
}