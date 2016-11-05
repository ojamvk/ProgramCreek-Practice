
public class Palindrome {

	public static void main(String[] args) {

		//System.out.println(isPalindrome("Red rum, sir, is murder"));
		System.out.println(isPalindrome("abcdefghijjihgfedcba"));
	}

	static boolean isPalindrome(String input)	{
		input = input.replaceAll("[^a-zA-Z0-9]", "");
		input = input.toLowerCase();
		int mid, k = 0;
		if(input.length()%2 != 0)	{
			mid = (input.length()/2);
			System.out.println(mid);
			return checkPalindrome(input, mid, mid);
		}
		else	{
			mid = (input.length()/2)-1;
			System.out.println(mid);
			return checkPalindrome(input, mid, mid+1);
		}
		

		
	}
	
	
	static boolean checkPalindrome(String input, int index1, int index2)	{
		int k = 0;
		System.out.println(input);
		System.out.println(input.charAt(index1));
		while(index1-k >=0 && index2+k < input.length())	{
			System.out.println(input.charAt(index1-k)+" and " + input.charAt(index2+k));
			if(input.charAt(index1-k) == input.charAt(index2+k))	{
				k++;
				continue;
			}
			else	{
				return false;
			}
		}
		return true;
	}
}
