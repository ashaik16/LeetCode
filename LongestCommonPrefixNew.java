class Solution {
    public String longestCommonPrefix(String[] strs) {
        
      int length=strs[0].length();
        String s1=strs[0];
        StringBuffer s= new StringBuffer("");
        for(int i=0;i<strs[0].length();i++){
           for(int j=1;j<strs.length;j++){
               if(strs[j].length()-1<i || strs[j].charAt(i)!=s1.charAt(i)){
                   return s.toString();
               }
               
             
           } 
              s.append(s1.charAt(i));
        }
        return s.toString();
    }
}
