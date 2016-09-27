
public class MoveZeroes {

	public static void main(String[] args) {

		int[] input = { 0, 0, 1, 3, 12 };
		int[] output = removeDuplicates(input);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

	static int[] moveZeroes(int[] input) {

		int[] output = input;
		int count = 0;
		for (int j = output.length; j >= 0; j--)
			for (int i = 0; i < j; i++) {
				if (output[i] == 0) {
					output[i] = output[i + 1];
					output[i + 1] = -1;
					count++;
				}
				if (output[i] == -1 && i + 1 < output.length) {
					output[i] = output[i + 1];
					output[i + 1] = -1;
				}
			}
		for (int i = 0; i < output.length; i++) {
			if (output[i] == -1)
				output[i] = 0;
		}
		return output;
	}

	static int[] moveZeroes2(int[] input) {
		int i = 0, j = 0;
		while (j < input.length) {
			System.out.println(input[j]);
			if (input[j] == 0) {
				j++;
			} else {
				input[i] = input[j];
				i++;
				j++;
			}
		}
		while(i<input.length)	{
			input[i] = 0;
			i++;
		}
		return input;
	}
	
	static int[] removeDuplicates(int[] input)	{
		int i=0, j=0;
		while(j< input.length)	{
			if(input[i] == input[j])	{
				j++;
			}
			else	{
				input[i+1] = input[j];
				i++;
				j++;
			}
		}
		i++;
		while(i<input.length)	{
			input[i] = -1;
			i++;
		}
		
		return input;
	}

}
