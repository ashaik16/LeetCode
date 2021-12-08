class Solution {
    public int evalRPN(String[] tokens) {
        String []operator= new String[]{"+","-","/","*"};
        int ans=0;
        int firstOperand=0;
        int secondOperand=0;
        List<String>list=Arrays.asList(operator);
        Stack<Integer> postOrder= new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            if(!list.contains(tokens[i]))
            {
                  postOrder.push(Integer.valueOf(tokens[i]));
      
                
            }
            else{
                 firstOperand= Integer.valueOf(postOrder.pop());
                 secondOperand= Integer.valueOf(postOrder.pop());
                if(tokens[i].equals("+"))
                   ans=firstOperand+secondOperand;
                     else if(tokens[i].equals("-"))
                   ans=secondOperand-firstOperand;
                     else if(tokens[i].equals("*"))
                   ans=firstOperand*secondOperand;
                     else if(tokens[i].equals("/"))
                   ans=secondOperand/firstOperand;
            postOrder.push(ans);
        }
        }
        return postOrder.pop();
    }
}
