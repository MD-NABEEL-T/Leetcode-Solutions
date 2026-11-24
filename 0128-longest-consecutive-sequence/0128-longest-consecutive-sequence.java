import java.util.*;
// [1,2,2,3,4,100,200]
// better solution O(n)logn + O(n)
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         Arrays.sort(nums);
//         int i=1;
//         int max=0;
//         int count=1;
//         if(nums.length==1){return 1;}
//         while(i<nums.length){
            
//             if(nums[i]==nums[i-1]){
//                 i++;
//             }
//             else if(nums[i]==nums[i-1]+1){
//                 count++;
//                 i++;
//             }
//             else{
//                 count=1;
//                 i++;
//             }
            
//             if(max<count){
//                 max=count;
//             }
//         }
        
//         return max;
//     }
// }

class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return 1;
        int longest=1;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        
        }
        for(int el : set){
            if(!set.contains(el - 1)){
                int count=1;
                int x=el;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                if(count>longest){longest=count;}
            }
            
        }
        return longest;
    }
}