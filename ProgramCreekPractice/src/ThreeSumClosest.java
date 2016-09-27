
import java.util.*;

public class ThreeSumClosest {

	public static void main(String[] args) {

		int[] array = {-1, 2, 1, -4};
		int sum = 5;
		int[] result = findThreeSumClosest(array, sum);
		System.out.println(result[0]+", "+result[1]+", "+result[2]);
	}
	
	static int[] findThreeSumClosest(int[] array, int sum)	{
		int maxDiff = Integer.MAX_VALUE;
		ArrayList<Integer> result = new ArrayList<Integer>();
		int [] output = new int[3];
		for(int i= 0; i+2< array.length; i++)	{
			int sum2 = array[i]+ array[i+1]+array[i+2];
			int diff = Math.abs(sum2-sum);
			if(maxDiff > diff)	{
				maxDiff = diff;
				output[0] = array[i];
				output[1] = array[i+1];
				output[2] = array[i+2];
			}
			
		}
		return output;
	}

}
