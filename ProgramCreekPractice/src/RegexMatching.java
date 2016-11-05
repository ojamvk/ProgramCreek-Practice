
public class RegexMatching {

	public static void main(String[] args) {

		System.out.println(isValid("abcdef", "a....."));
	}

	static boolean isValid(String input, String regex)	{
		char[] inputArray = input.toCharArray();
		char[] regexArray = regex.toCharArray();
		int i = 0, j = 0;
		while(i<inputArray.length)	{
			
			if(regexArray[j] == '.')	{
				
			}
			else if(regexArray[j] == '*')	{
				
			}
			else if(regexArray[j] != inputArray[i])	{
				return false;
			}
			i++;
			j++;
		}
		
		return true;
	}
}
