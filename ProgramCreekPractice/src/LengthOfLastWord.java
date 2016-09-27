
public class LengthOfLastWord {

	public static void main(String[] args) {

		String str = "This is a sample string hello world bestestestest";
		String str2 = "bestestestest";
		System.out.println(findLengthOfLastWord(str));
		System.out.println(str2.length());
	}
	
	static int findLengthOfLastWord(String input)	{
		/*if(input.length() == 0)	{
			return 0;
		}*/
		char[] inputArray = input.toCharArray();
		int count = 0, i= inputArray.length-1;
		while(i>=0 && inputArray[i] != ' ')	{
				count++;
				i--;
		}
		return count;
	}

}
