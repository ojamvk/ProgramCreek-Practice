
import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {

		int[] array = { -1, 0, 1, 2, -1, -4 };

		ArrayList<ArrayList<Integer>> output = findThreeNumbers(array, 0);

	}

	static ArrayList<ArrayList<Integer>> findThreeNumbers(int[] array, int sum) {
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < array.length; i++) {

			int check = sum - array[i];
			if (map.containsKey(check)) {
				map.get(check).add(i);
			} else {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(i);
				map.put(check, temp);
			}
		}
		System.out.println(map);
		int i = 0, j = 1;
		ArrayList<Integer> list;
		for (i = 0; i < array.length-1; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (map.containsKey(array[i] + array[j])) {
					for (Integer index : map.get(array[i] + array[j])) {
						list = new ArrayList<Integer>();
						list.add(array[i]);
						list.add(array[j]);
						list.add(array[index]);
						//if(!output.contains(list))
							output.add(list);
					}
					map.remove(array[i] + array[j]);
				}
			}

		}
		
		System.out.println(output);
		return output;
	}

}
