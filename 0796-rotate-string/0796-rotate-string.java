class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder st=new StringBuilder(s);
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(0);
            st.deleteCharAt(0);
            st.append(ch);
            
            if(st.toString().equals(goal)){return true;}
        }
        return false;
    }
}