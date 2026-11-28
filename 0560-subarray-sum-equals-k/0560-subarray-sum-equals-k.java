import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Long,Integer> map= new HashMap<>();
        long prefixSum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            if(prefixSum==k){
                count++;
            }

            if(map.containsKey(prefixSum-k)){
                count=count+map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}

// two program only works for program of calculating the biggest length of subarray that sum up to k

// two pointer approach only for positives
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count=0;
//         int left=0;
//         int sum=0;
        
//         for(int right=0;right<nums.length;right++){
//             sum+=nums[right];
//             while(sum>k){
//                 sum-=nums[left];
//                 left++;
//             }
//             if(sum==k){
//                 count++;
//             }
//         }
//         return count;
//     }  
// }



// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         Map<Integer,Integer> map=new HashMap<>();
//         int sum=0;
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             sum+=nums[i];
//             if(sum==k){
//                 count++;
//             }
//             int needed=sum-k;
//             if(map.containsKey(needed)){
//                 count++;
//             }


//             map.putIfAbsent(sum,i);
//         }
//         return count;
//     }
// }