
public class LongestSubstringWith2Chars {

	public static void main(String[] args) {
		computeLongestSubstring("abcbbbbcccbdddadacb");
	}

	public static void computeLongestSubstring(String input) {
		System.out.println(input);
		char[] inputChars = input.toCharArray();
		char first, second;
		first = inputChars[0];
		second = inputChars[1];
		boolean prevFirst = true;
		int index1 = 0, index2 = 1, length = 1, maxIndex1 = 0, maxIndex2 = 1, indexSecond = 1;
		String longestSubstring = input.substring(0, 1);
		for (int i = 2; i < inputChars.length; i++) {
			char currentChar = inputChars[i];
			if (first == currentChar || second == currentChar) {
				if (first == currentChar) {
					prevFirst = true;
				} else {
					prevFirst = false;
				}
				indexSecond = i;
				index2++;
				if((maxIndex2-maxIndex1) < (index2-index1))	{
					maxIndex2 = index2;
					maxIndex1 = index1;
				}
				System.out.println(index1 + "," + index2 + " " + first + ", " + second);
			} else {
				if (prevFirst == true) {
					index1 = indexSecond;
				} else {
					index1 = index2;
				}
				first = inputChars[index1];
				index2 = i;
				second = currentChar;
				if((maxIndex2-maxIndex1) < (index2-index1))	{
					maxIndex2 = index2;
					maxIndex1 = index1;
				}
				System.out.println(index1 + "," + index2 + " " + first + ", " + second);
			}
		}
		System.out.println(input.substring(maxIndex1, maxIndex2));
	}

}
