import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharacters {
	public static void main(String args[]) {
		String s= "caiopa";
		char[] c1 = s.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character c : c1) {
			
			if (charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c) + 1);
			System.out.println(c);
			}
			else
				charMap.put(c, 1);
		}
		
		
		
	}
}
