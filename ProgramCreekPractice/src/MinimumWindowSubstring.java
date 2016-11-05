import java.util.*;

public class MinimumWindowSubstring {

	public static void main(String[] args) {

		String input = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(input);
		System.out.println(getMinWindowSubstring(input, t));
	}

	static String getMinWindowSubstring(String input, String t) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] inputArray = input.toCharArray();
		char[] tArray = t.toCharArray();
		String sub = "";
		int length = 0, minLength = Integer.MAX_VALUE, start = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (t.contains("" + inputArray[i]) && !map.containsKey(inputArray[i])) {
				map.put(inputArray[i], i);
				System.out.println(map);
			} else if (map.containsKey(inputArray[i])) {
				int value = map.get(inputArray[i]);
				int minIndex = Integer.MAX_VALUE;
				Iterator it = map.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry<Character, Integer> pair = (Map.Entry<Character, Integer>) it.next();
					if (pair.getValue() <= value) {
						it.remove();
					}
				}
				for (Map.Entry<Character, Integer> pair : map.entrySet()) {
					minIndex = Math.min(minIndex, pair.getValue());
				}
				start = minIndex;
				map.put(inputArray[i], i);
			} else {
				continue;
			}
			if (map.size() == tArray.length) {
				System.out.println("i: " + i + " start: " + start);
				length = i - start;
				if (minLength > length) {
					minLength = length;
					sub = input.substring(start, i + 1);
				}
				System.out.println(sub);
			}
		}
		return sub;
	}
}
