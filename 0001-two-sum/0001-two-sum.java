// brute solution 50ms;
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] al=new int[2];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     al[0]=i;
//                     al[1]=j;

//                 }
//             }
//         }
//         return al;

//     }
// }

// optimal solution -3ms
// could not sort and return since it asks the indexes using two pointer 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (map.containsKey(needed)) {
                arr[0] = i;
                arr[1] = map.get(needed);
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return arr;
    }
}