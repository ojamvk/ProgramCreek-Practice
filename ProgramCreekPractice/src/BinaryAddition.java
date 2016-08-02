
public class BinaryAddition {

	public static void main(String[] args) {
		String number1 = "100";
		String number2 = "100";
		int num1 = Integer.parseInt(number1, 2);
		int num2 = Integer.parseInt(number2, 2);
		
		System.out.println(Integer.toBinaryString(num1 + num2));

	}

}
