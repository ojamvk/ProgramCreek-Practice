import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 2, 7 };
		int k = 2;
		System.out.println(kthLargestElement(arr, k));
	}

	static int computeKthLargest(int[] array, int k) {
		getKth(array, 0, array.length - 1, k);
		return 0;
	}

	static int getKth(int[] array, int start, int end, int k) {
		int pivot = array[end];
		int left = start;
		int right = end;
		while (true) {
			while (left < right && array[left] < pivot) {
				left++;
			}
			while (right > left && array[right] >= pivot) {
				right--;
			}
			if (left == right) {
				break;
			}
			swap(array, left, right);
		}
		swap(array, left, end);
		if(k == left + 1)	{
			return pivot;
		}
		else if(k < left+1)	{
			return getKth(array, start, left-1, k);
		}
		else	{
			return getKth(array, left+1, end, k);
		}
	}

	static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	public static int kthLargestElement(int[] array, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k);
		for (int i : array) {
			System.out.println("Offer : " + queue.offer(i));
			if (queue.size() > k) {
				System.out.println("Poll : " + queue.poll());
			}
		}
		return queue.peek();
	}

	static int getKthLargestElement(int[] array, int k) {
		// Using Quick Sort.

		if (k < 1 || array.length == 0) {
			return 0;
		}

		return getKth(array.length - k + 1, array, 0, array.length - 1);
	}

	static int getKth(int k, int[] array, int start, int end) {

		return 0;
	}
}
