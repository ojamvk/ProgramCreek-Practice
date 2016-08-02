import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args)	{
		int[] arr = {1, 2, 3, 4, 5, 6, 2, 7};
		int k =2;
 		System.out.println(kthLargestElement(arr, k));
	}
	
	public static int kthLargestElement(int[] array, int k)	{
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k);
		for(int i : array)	{
			System.out.println("Offer : "+ queue.offer(i));
			if(queue.size() > k)	{
				System.out.println("Poll : "+ queue.poll());
			}
		}
		return queue.peek();
	}
}
