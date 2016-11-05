package misc;

public class RectangleOverlap {

	public static void main(String[] args) {

		Point l1 = new Point(0, 3);
		Point r1 = new Point(3, 0);
		Point l2 = new Point(4, 3);
		Point r2 = new Point(8, 0);
		System.out.println(isOverlapping(l1, r1, l2, r2));
	}
	
	static boolean isOverlapping(Point l1, Point r1, Point l2, Point r2)	{
		
		if(l1.x >= r2.x || l2.x >= r1.x)	{
			return false;
		}
		if(r1.y >= l2.y || r2.y >= l2.y )	{
			return false;
		}
		return true;
	}

}
