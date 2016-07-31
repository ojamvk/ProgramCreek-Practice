import java.util.ArrayList;

public class MergeArrays {

	public static void main(String[] args) {

		int [] array1 = {2, 2,2,3,4,5};
		int [] array2 = {2,4,6,8,9};
		System.out.println(mergeArrays(array1, array2));
	}

	private static ArrayList mergeArrays(int[] array1, int[] array2) {

		ArrayList<Integer> mergedArray = new ArrayList<Integer>();
		int length = array1.length+array2.length;
		int i = 0, j =0;
		while(i<array1.length || j<array2.length){
			if(i == array1.length)	{
				for(int index = j; index<array2.length; index++)	{
					mergedArray.add(array2[index]);
				}
				break;
			}
			else if(j == array2.length)	{
				for(int index = i; index<array1.length; index++)	{
					mergedArray.add(array1[index]);
				}
				break;
			}
			else if(array1[i]<array2[j])	{
				mergedArray.add(array1[i]);
				i++;
			}
			else	{
				mergedArray.add(array2[j]);
				j++;
			}
		}
		return mergedArray;
	}

}
