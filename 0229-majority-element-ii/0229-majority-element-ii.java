// Tomorrow i will submit this since tomorrow i have to study for the pom exam on 21

// brute force using two for loops 

// better solution is using hashing
import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int k=n/3;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==k+1){
                result.add(nums[i]);
            }
        }

        return result;
    }
}

// Optimal Solution 