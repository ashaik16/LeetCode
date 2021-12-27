class Solution {
    public int findComplement(int num) {
        Stack<Integer> stack= new Stack<Integer>();

        StringBuilder sr = new StringBuilder();
        while(num>0){
            stack.push(num%2);
            num=num/2;
        }
        while(!(stack.isEmpty())){
            sr.append(stack.pop()==1? 0:1);
        }

        return Integer.parseInt(sr.toString(),2);
    }
}
/*
Alternative Approach
class Solution {
    public int findComplement(int num) {
        Stack<Integer> stack= new Stack<Integer>();
    
        StringBuilder sr = new StringBuilder();
      //Number to binary shortcut 
  String s=String.valueOf( Integer.toBinaryString(num));
            char charArray[]=s.toCharArray();
    for(int i=0;i<s.length();i++)
        if(charArray[i]=='1')
            charArray[i]='0';
            else
               charArray[i]='1' ; 
        return Integer.valueOf(String.valueOf(charArray),2);
    }
}

*/
