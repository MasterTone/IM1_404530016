import java.util.Scanner;

public class Easter {
	int year;
	int month;
	int day;

	Easter() {
	}

	Easter(int y, int m, int d) {
		this.year = y;
		this.month = m;
		this.day = d;
	}

	public void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int y = this.year;
		int a = y % 19;
		int b = y / 100;// Math.floor(), -2
		int c = y % 100;
		int d = b / 4;// Math.floor()
		int e = b % 4;

		// why add 13?
		int g = (8 * b + 13) / 25;// Math.floor()
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;// Math.floor()
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		this.month = (h - m + r + 90) / 25;
		this.day = (h - m + r + this.month + 19) % 32;
	}

	public String toString() {
		return "In" + this.year + ", Easter Sunday is: month = " + this.month + "and day = " + this.day;
	}
}
