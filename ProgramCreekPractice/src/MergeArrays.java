import java.util.ArrayList;

public class MergeArrays {

	public static void main(String[] args) {

		int [] array1 = {2, 2,2,3,4,5};
		int [] array2 = {1, 1, 1, 2,4,6,8,9};
		//System.out.println(mergeArrays(array1, array2));
		int[] output = mergeArrays2(array1, array2);
		for(int i= 0; i< output.length; i++)	{
			System.out.println(output[i]);
		}
	}
	
	static int[] mergeArrays2(int[]array1, int[] array2)	{
		int [] array = new int[array1.length+array2.length];
		int i=array1.length, j = array2.length;
		for(int k = 0; k< array1.length; k++)	{
			array[k] = array1[k];
		}
		while(i>0 && j>0)	{
			if(array[i-1] > array2[j-1])	{
				array[i+j-1] = array[i-1];
				i--;
			}
			else	{
				array[i+j-1] = array2[j-1];
				j--;
			}
		}
		
		while(j>0)	{
			array[j-1] = array2[j-1];
			j--;
		}
		
		
		return array;
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
