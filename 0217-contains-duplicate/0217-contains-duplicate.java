class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result=false;
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         return result=true;
        //     }
        //     else{
        //         map.put(nums[i],1);
        //     }
        // }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                result=true;
                break;
            }
        }
        return result;
    }
}