// brute force solution using hashing concept but used array only 
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int nm=n*m;
        int arr[]=new int[nm+1];

        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                int val=grid[i][j];
                arr[val]+=1;
            }
        }
        int result[]=new int[2];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                // missing number
                result[1]=i;
            }
            else if(arr[i]>1){
                //repeating number 
                result[0]=i;
            }
        }
        return result;
    }
}