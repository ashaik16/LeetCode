class Solution {
    public String removeDuplicates(String s, int k) {
      Stack < Pair < Character, Integer >> pairStack = new Stack < Pair < Character, Integer >> ();
        StringBuilder sr = new StringBuilder();
        char[] charArray = s.toCharArray();
        Pair p;

        for (int i = 0; i < charArray.length; i++) {
            if ((pairStack.isEmpty())) {
                
                p = new Pair(charArray[i], 1);
                pairStack.add(p);

                continue;
            }
          else  if (pairStack.peek().getValue() == k) {

                for (int j = 0; j < k; j++) {
                    if (!(pairStack.isEmpty())) 
                        pairStack.pop();


                    
                }
                i = i - 1;
            } else if (pairStack.peek().getKey() == charArray[i]) {

                p = new Pair(charArray[i], pairStack.peek().getValue() + 1);
                pairStack.add(p);

            } else if (pairStack.peek().getKey() != charArray[i]) {

                p = new Pair(charArray[i], 1);
                pairStack.add(p);

            }
        }
      //This condition is for the last index if there is a repeat with the last index for example a string called aabbccc and k=3 so including the last c the string bcoumz aabb 
      //The above forloop does not take into consideration the last c
        if (pairStack.peek().getValue() == k) {

            for (int j = 0; j < k; j++) {
                if (!(pairStack.isEmpty())) 
                    pairStack.pop();


                
            }

        }
        while (!(pairStack.isEmpty())) 
            sr.append(pairStack.pop().getKey());
        
        return sr.reverse().toString();
    }
}
