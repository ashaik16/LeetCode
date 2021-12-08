class Solution {
    public boolean isPalindrome(String s) {
        char []charArray=s.toLowerCase().toCharArray();
          int ascii=0;
        int start=0;
 
          char character;
           StringBuilder sr1= new StringBuilder();
         List<Character> charList= new ArrayList<Character>();   
        
        for(int i=0;i<charArray.length;i++){
             character=charArray[i];
         ascii=((int)character);
            
      if(ascii>=97 && ascii<=122 || ascii>=48 && ascii<=57)
       //   if(charArray[i] >= 'a' && charArray[i] <= 'z' ||charArray[i]>='0' && charArray[i]<='9') 
           charList.add(charArray[i]);
            
    }
               int end=charList.size()-1;

//      for (Character ch: charList) 
//             sr1.append(ch);
      //  if(sr1.toString().equals(sr1.reverse().toString
        while(start<end){
            if(!(charList.get(start)==charList.get(end)))

                return false;
            else
                start++;
            end--;
        }
          return true;
        // else
        //     return false;
}
}
