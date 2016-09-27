import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
	
	public static void main(String[] args) {

		System.out.println(isValid("(()"));
	}
	
	static boolean isValid(String input)	{
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		char[] inputArray = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		int count = 0;
		for(char c: inputArray)	{
			if(map.get(c)!= null)	{
				stack.push(c);
			}
			else	{
/*				if(stack.isEmpty())	{
					System.out.println(count);
					return false;
				}*/
				if(!stack.isEmpty())	{
				stack.pop();
				count+=2;
				}
			}
		}
		if(!stack.isEmpty())	{
			System.out.println(count);
			return false;
		}
		System.out.println(count);
		return true;
	}

}
