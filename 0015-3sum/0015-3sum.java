import java.util.*;

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums){
//         List<List<Integer>> result=new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 for(int k=j+1;k<nums.length;k++){
//                     if(nums[i]+nums[j]+nums[k]==0){
//                         List<Integer> list=new ArrayList<>();

//                         list.add(nums[i]);
//                         list.add(nums[j]);
//                         list.add(nums[k]);
//                         // since duplicate lists might occur so sort it 
//                         Collections.sort(list);
//                         if(!result.contains(list)){
//                             result.add(list);
//                         }
//                     }
//                 }
//             }
//         }
//         return result;
//     }
// }

// [-1,0,1,2,-1,-4]
// [-4,-1,-1,0,1,2]
class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }

                }
            }
        }
        return result;
    }
}