
public class FindSubArray {

	public FindSubArray() {
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 1};
		int s = 4;
		int length = minSubArrayLen(arr, s);
		System.out.println(length);
	}

	private static int minSubArrayLen(int[] arr, int s) {
		int length = Integer.MAX_VALUE, sum = 0;
		int start = 0, i = 0;
		while(i<arr.length)	{
			if(arr[i] >= s)	{
				return 1;
			}
			else if(sum>s)	{
				length = Math.min(length, i - start);
				sum = sum - arr[start];
				start++;
				//i = start;
			}
			sum += arr[i];
			i++;
		}
		if(sum>=s)
			return length;
		else
			return 0;
	}

}
