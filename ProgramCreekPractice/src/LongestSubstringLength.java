import java.util.Hashtable;

public class LongestSubstringLength {

	public static void main(String[] args)	{
		
		String inputString = "abcabcbbabcdefdfdf";
		System.out.println(lengthOfLongestSubString(inputString));
	}

	private static int lengthOfLongestSubString(String inputString) {
		char[] input = inputString.toCharArray();
		int maxLength = 1;
		Hashtable<Character, Integer>	charsVisited = new Hashtable<Character, Integer>();
		for(int i=0; i< input.length; i++)	{
			if(!charsVisited.containsKey(input[i]))	{
				charsVisited.put(input[i], i);
			}
			else	{
				
				i = charsVisited.get(input[i]);
				maxLength = Math.max(maxLength, charsVisited.size());
				charsVisited = new Hashtable<Character, Integer>();
				
			}
			
		}
		
		return maxLength;
	}
}
