
/*
 * [A]99
 * [TA's advise]
 * 1.印象中你有來問我問題, 不過你的變數資料型態是double卻讓使用者輸入integer這個問題沒有改, 我還是覺得很奇怪, 就扣個1分.
 * 2.基本上整體沒什麼太大的問題, 不過有些東西可以讓你的程式易讀性更高, 或許可以慢慢朝著這方面努力.
 * 3.Good Job!
 * */

import java.util.*;

class Rectangle {
	// 這邊可以直接寫成一行
	// double Height,Width,X,Y;
	double Height;
	double Width;
	double X;
	double Y;

	Rectangle() {
		// this(-1,-1,-1,-1); //建議透過這樣可以去初始化物件(產生時我們就賦予值), 這行會去call哪一行建構子, 想想看.
	}

	Rectangle(double height, double width, double x, double y) {
		Height = height;
		Width = width;
		X = x;
		Y = y;
	}

	public double getHeight()// protected, private, ""
	{
		return Height;
	}

	public double getWidth() {
		return Width;
	}

	public double getX() {
		return X;
	}

	public double getY() {
		return Y;
	}

	public String toString() {
		return "java.Rectangle:" + "[ x=" + X + ",y=" + Y + ",width=" + Width + ",height=" + Height + "]";
	}

}

public class RectangleTester {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		// 這邊可以直接寫成一行
		// double Height,Width,X,Y;
		double height;
		double width;
		double x;
		double y;
		try {
			System.out.println("Height:");
			//這邊邏輯很奇怪, 你的變數資料型態是double卻讓使用者輸入integer, 建議改成console.nextDouble();
			height = console.nextInt();
			System.out.println("Width:");
			width = console.nextInt();
			System.out.println("X:");
			x = console.nextInt();
			System.out.println("Y:");
			y = console.nextInt();
			Rectangle rec1 = new Rectangle(height, width, x, y);

			System.out.println(rec1.toString());
			System.out.println("Area:" + rec1.getWidth() * rec1.getHeight());
			System.out.println("Perimeter:" + (rec1.getWidth() * 2 + rec1.getHeight() * 2));

			System.out.println("\nHeight:");
			height = console.nextInt();
			System.out.println("Width:");
			width = console.nextInt();
			System.out.println("X:");
			x = console.nextInt();
			System.out.println("Y:");
			y = console.nextInt();
			Rectangle rec2 = new Rectangle(height, width, x, y);

			System.out.println(rec2.toString());
			System.out.println("Area:" + rec2.getWidth() * rec2.getHeight());
			System.out.println("Perimeter:" + (rec2.getWidth() * 2 + rec2.getHeight() * 2));
		} catch (Exception e) {
			System.out.println("error!");
			System.exit(0);
		}
	}

}
