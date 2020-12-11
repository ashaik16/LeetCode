import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateInString {
	public static void main(String args[]) {
		String s1 = "Anam";
		char[] c1 = s1.toUpperCase().toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character c : c1) {
			
			if (charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c) + 1);
			
			}
			else
				charMap.put(c, 1);
		}
		
		for(Map.Entry<Character,Integer> entries:charMap.entrySet())
			
		{
			System.out.println(entries.getKey()+":"+entries.getValue());
		}
	}
}
