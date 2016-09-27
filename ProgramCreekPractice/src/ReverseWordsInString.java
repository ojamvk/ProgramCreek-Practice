
public class ReverseWordsInString {

	public static void main(String[] args) {

		String s = "The sky is blue";
		System.out.println(reverseString(s));
	}
	
	static String reverseString(String input)	{
		String reverse = "";
		String[] arr = input.split(" ");
		for(int i=arr.length-1; i>=0; i--)	{
			reverse+= arr[i] + " ";
		}
		return reverse.trim();
	}
	

}
