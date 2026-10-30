// class Solution {
//     public boolean isAnagram(String s, String t) {
//         HashMap<Character,Integer> hm=new HashMap<>();
//         if(s.length()!=t.length()){return false;}
//         for(int i=0;i<s.length();i++){
//             hm.put(s.charAt(i),hm.getOrDefault(hm.get(s.charAt(i))+1,0));
//         }
//         for(int i=0;i<t.length();i++){
//             if(hm.getOrDefault(t.charAt(i),-1)==0){}
//             else{return false;}
//         }
//         return true;
//     }
// }
class Solution{
    public boolean isAnagram(String s, String t){
        int arr[]=new int[26];

        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int ch:arr){
            if(ch!=0){return false;}
        }
        return true;
    }
}