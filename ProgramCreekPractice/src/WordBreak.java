import java.util.*;

public class WordBreak {

	public static void main(String[] args) {

		System.out.println(isRoundRotation("abc", "cab"));
	}
	
	static boolean isRoundRotation(String str1, String str2)	{
		char[] input1 = str1.toCharArray();
		char[] input2 = str2.toCharArray();
		int j = str2.indexOf(input1[0]);
		for(int i = 0; i< input1.length; i++)	{
			if(j==input2.length)	{
				j = 0;
			}
			if(input1[i] == input2[j])	{
				j++;
			}
			else	{
				return false;
			}
		}
		return true;
	}
	
}
