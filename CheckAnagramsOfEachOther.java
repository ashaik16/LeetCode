/*Optimized solution*/
class Solution {
    public boolean isAnagram(String s, String t) {

     if(s.length()!=t.length())
         return false;
            Map<Character,Integer> m1 = new HashMap<>();
            Map<Character,Integer> m2 = new HashMap<>();

                for(int i=0;i<s.length();i++){
                    m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);
                    m2.put(t.charAt(i), m2.getOrDefault(t.charAt(i), 0) + 1);
                }
            return m1.equals(m2);
            }
}




/*Alternative*/


import java.util.HashMap;
import java.util.Map;

public class CheckAnagramsOfEachOther {
public static void main(String args[])
{
	String s1="Anam";
	String s2="Mana";
	
	char[]c1=s1.toUpperCase().toCharArray();
	char []c2=s2.toUpperCase().toCharArray();
	
	Map<Character,Integer>charArray1 =new HashMap<Character,Integer>();
	Map<Character,Integer>charArray2 =new HashMap<Character,Integer>();
	for(Character c:c1)
	{
		if(charArray1.containsKey(c))
		
			charArray1.put(c, charArray1.get(c)+1);
		else
			charArray1.put(c, 1);
		
	}
	for(Character c:c2)
	{
		if(charArray2.containsKey(c))
		
			charArray2.put(c, charArray2.get(c)+1);
		else
			charArray2.put(c, 1);
		
	}
	
	if(charArray1.equals(charArray2))
		System.out.println("They are anagrams");
	else
		System.out.println("They are not anagrams");
}

}
