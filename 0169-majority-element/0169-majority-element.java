class Solution {
    public int majorityElement(int[] nums) {
        // brute force approach use two for loops

        // better approach is hashing = hashmap
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>(nums.length/2)){
                return nums[i];
            }
        }
        return -1;
        
    }
}