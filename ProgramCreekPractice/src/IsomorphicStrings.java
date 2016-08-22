
import java.util.*;

public class IsomorphicStrings {

	public static void main(String[] args) {
		System.out.println(checkIsomorphic("whe", "abd"));
	}

	public static boolean checkIsomorphic(String a, String b) {
		HashMap<Character, Character> comparator = new HashMap<Character, Character>();
		char[] first = a.toCharArray();
		char[] second = b.toCharArray();
		if(first.length != second.length)	{
			return false;
		}
		for (int i = 0; i < first.length; i++) {
			char f = first[i];
			char s = second[i];
			if (comparator.containsKey(f)) {
				if (comparator.get(f) != s) {
					return false;
				}
			} else if (comparator.containsValue(s)) {
				if(comparator.get(f) != s)	{
					return false;
				}
			}
			else	{
				comparator.put(f, s);
			}
		}
		return true;
	}

}
