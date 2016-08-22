
public class HouseRobber {

	static int MAXVALUE = 20;

	public static void main(String[] args) {
		int[] amount = { 50, 1, 1, 50 };
		System.out.println(computeBestAmount(amount));
		Node left = new Node(null, null, 20);
		Node right = new Node(null, null, 10);
		Node n = new Node(left, right, 10);
		computeBestAmountTree(n);
	}

	public static int computeBestAmount(int[] num) {
		int[] dp = new int[MAXVALUE];
		dp[0] = num[0];
		dp[1] = Math.max(dp[0], num[1]);

		for (int i = 2; i < num.length; i++) {
			dp[i] = Math.max(num[i] + dp[i - 2], dp[i - 1]);
		}
		return dp[num.length - 1];

	}

	public static int computeBestAmountTree(Node root) {
		//int amount = Math.max(root.value , b);
		return 0;
	}

}
