// a subarray must consist of consecutive elements, while a subsequence can skip elements as long as their original relative order is maintained

//brute force 
// T.C is O(n^3)
// class Solution {
//     public int maxProduct(int[] nums) {
//         int max=Integer.MIN_VALUE;
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int value=1;
//                 for(int k=i;k<=j;k++){
//                 value*=nums[k];
//                 if(value>max){max=value;}
//                 }
//             }
                
//         }
//     return max;
//     }
// }

// better solution O(n^2)
class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int value=1;
            for(int j=i;j<nums.length;j++){
                value*=nums[j];
                if(max<value)max=value;
            }
        }
        return max;
    }
}

// optimal solution O(n)
// observation:
// 1 , all positive => multiply everyone
// 2 , even -ve multiply 
// 3 , odd -ve 