
public class MinSubArray {

	public static void main(String[] args) {

		int[] array = {4, 3, 1, 2, 1};
		int sum = 4;
		System.out.println(findMinSizeSubArray(array, sum));
		
	}

	static int findMinSizeSubArray(int[] array, int sum)	{
		int minSize = Integer.MAX_VALUE;
		int i= 0, j = 0;
		int sum2 = 0;
		while(j < array.length)	{
			if(sum2>=sum)	{
				minSize = Math.min(minSize, j-i);
				System.out.println(i+" to "+(j-1)+" Sum: "+ sum2);
				sum2-=array[i];
				i++;
			}
			sum2+=array[j];
			//System.out.println(sum2);
			j++;
		//minSize = Math.min(minSize, j-i+1);
		}
		return minSize;
	}
}
