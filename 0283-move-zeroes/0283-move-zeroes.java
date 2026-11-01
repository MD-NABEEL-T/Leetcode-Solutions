class Solution {

    // FIRST APPROACH = brute force
    public void moveZeroes(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i:nums){
            if(i!=0){
                list.add(i);
            }
        }
        for(int i=0;i<list.size();i++)
        {
            nums[i]=list.get(i);
        }
        for(int i=list.size();i<n;i++){
            nums[i]=0;
        }
    }
}