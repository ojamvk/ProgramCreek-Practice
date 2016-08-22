import java.util.ArrayList;

public class MergeIntervals {

	public static void main(String[] args) {

		int[] interval1 = {1, 3};
		int[] interval2 = { 2, 3 };
		int[] interval3 = { 5, 7 };
		int[] interval4 = { 5, 8 };
		int[] interval5 = { 1, 3 };
		ArrayList intervals = new ArrayList();
		intervals.add(interval5);
		intervals.add(interval2);
		intervals.add(interval3);
		intervals.add(interval4);
		intervals.add(new int[]{6, 7});
		intervals.add(new int[]{10, 12});
		mergeIntervals(intervals);
	}

	public static void mergeIntervals(ArrayList intervals) {
		ArrayList results = new ArrayList();
		int[] prev = (int[]) intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			int[] curr = (int[]) intervals.get(i);
			
			//if (prevResult[0]!= curr[0] || prevResult[1] != curr[1]) {
				
				if (prev[1] < curr[0]) {
					results.add(prev);
					//results.add(curr);
					
					prev = curr;
				} else {
					int[] newInterval = { Math.min(prev[0], curr[0]), Math.max(prev[1], curr[1]) };
					//results.add(newInterval);
					prev = newInterval;
				}
				
			/*} else {
				prev = curr;
			}
*/
		}
		results.add(prev);
		for(int i = 0; i<results.size(); i++)		{
			int[] result = (int[])results.get(i);
			System.out.println(result[0] + ", " + result[1]);
		}
	}
}
