// brute force using two for loops 

// better solution is using hashing
// O(n) for t.c and O(n) for s.c
import java.util.*;
// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         int n=nums.length;
//         int k=n/3;
//         Map<Integer,Integer> map=new HashMap<>();
//         List<Integer> result=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//             if(map.get(nums[i])==k+1){
//                 result.add(nums[i]);
//             }
//         }

//         return result;
//     }
// }

// Optimal Solution 
// O(n) for t.c and O(1) for s.c

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int k=n/3;
        List<Integer> result=new ArrayList<>();
        int count1=0;
        int count2=0;
        int el1=0;
        int el2=0;
        // to find the right two element 
        for(int i=0;i<n;i++){
            if(count1==0 && nums[i]!=el2){
                el1=nums[i];
                count1=1;
            }
            else if(count2==0 && nums[i]!=el1){
                el2=nums[i];
                count2=1;
            }
            else if(el1==nums[i]){count1++;}
            else if(el2==nums[i]){count2++;}
            else{
            count1--;
            count2--;}
        }
        
        // to add which is the real one to add
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(el1==nums[i]){
                count1++;

            }
            else if(el2==nums[i]){
                count2++;
            }
        }
        if(count1>k){result.add(el1);}
        if(count2>k){result.add(el2);}

        return result;
    }
}
