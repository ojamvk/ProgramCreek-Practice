
public class BinarySearch {

	public static void main(String[] args) {

		//System.out.println(getIndexInArray(new int[]{1, 2, 3, 4, 5}, 4));
		System.out.println(getMaxElement(new int[]{2, 3, 4, 5, 6, 7, 10, 9, 8, 7}, 0, 9));
	}

	static int getMaxElement(int[] array, int start, int end)	{
		while(start <= end)	{
			int mid = (start+end)/2;
			if(array[mid] <= array[mid+1])	{
				start = mid+1;
			}
			else	{
				end = mid-1;
			}
		}
		return array[start];
	}
	static int getIndexInArray(int[] array, int num)	{
		int i = 0;
		int j = array.length-1;
		while(i<=j)	{
			int mid = (i+j)/2;
			if(array[mid] == num)	{
				return mid;
			}
			if(array[mid] < num)	{
				i = mid+1;
			}
			else {
				j = mid-1;
			}
			
			
		}
		return i;
	}
}
