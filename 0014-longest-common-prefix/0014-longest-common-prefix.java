//we sort the array so that only the first and last element is compared if that is right then this is also like
// top tap tame 
// arrays.sort = tap tame top so now the answer will be t only since only tap and top was compared
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        Arrays.sort(strs);
        String first=strs[0];
        //strs is array so use length not length()
        String last=strs[strs.length-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==(last.charAt(i))){
                ans+=first.charAt(i);
            }
            else{
                break;
            }
        }
        return ans;
    }
}