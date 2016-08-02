import java.util.ArrayList;

import sun.misc.Queue;

public class WordLadder {
	private String word;
	private int level;
	
	public WordLadder(String word, int level)	{
		this.word = word;
		this.level = level;
	}
	

	public static void main(String[] args) {

		//WordLadder wl = new WordLadder();
		
		String word1 = "hit";
		String word2 = "lot";
		String[] dictionary = { "dog", "dot", "bag", "hot", "lot", "log", "cog" };
		Queue queue = new Queue();
		ArrayList<String> visited = new ArrayList<String>();
		WordLadder wl = new WordLadder(word1, 1);
		
		/*wl.setWord(word1);
		wl.setLevel(1);*/
		queue.enqueue(wl);
		while (!queue.isEmpty()) {
			WordLadder wl2 = null;
			try {
				 
				wl2 = (WordLadder) queue.dequeue();
				System.out.println(wl2.getWord());
				if(wl2.getWord().equals(word2))	{
						System.out.println(wl2.getLevel());
						break;
				}
				for (String s : dictionary) {
					if (editDistance(wl2.getWord(), s) == 1 && !(visited.contains(s))) {
						wl = new WordLadder(s, wl2.getLevel()+1);
						/*wl.setWord(s);
						wl.setLevel(wl2.getLevel()+1);*/
						queue.enqueue(wl);
						visited.add(wl2.getWord());
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

		//int distance = editDistance(word1, word2);
		//System.out.println(distance);
	}

	public static int editDistance(String word1, String word2) {
		int length = 0, length1 = word1.length(), length2 = word2.length();
		int dp[][] = new int[length1 + 1][length2 + 1];
		int insert, delete, update;
		for (int i = 0; i < length1 + 1; i++) {
			dp[i][0] = i;
		}
		for (int j = 0; j < length2 + 1; j++) {
			dp[0][j] = j;
		}
		for (int i = 0; i < length1; i++) {
			char c1 = word1.charAt(i);
			for (int j = 0; j < length2; j++) {
				char c2 = word2.charAt(j);
				if (c1 == c2) {
					dp[i + 1][j + 1] = dp[i][j];
				} else {
					insert = dp[i][j + 1] + 1;
					delete = dp[i + 1][j] + 1;
					update = dp[i][j] + 1;
					dp[i + 1][j + 1] = Math.min(Math.min(insert, delete), update);
				}
			}
		}

		return dp[length1][length2];
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
