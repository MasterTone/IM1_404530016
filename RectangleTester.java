import java.util.Random;
/*
 * [A]98
 * [TA's advise]
 * 1.x-axis, y-axis�O�_�i��|���p���I�O?
 * 2.�å��ϥ�getheight(),getwidth()�h�i��B��, �o������2��.
 * */

class homework1 {
	int x;
	int y;
	double height;
	double width;

	// area�Mperimeter�i�H�z�Lheight�Mwidth����, �O�_���B�~�ŧi�����n�ʩO?
	double area;
	double perimeter;

	homework1() {
		// this(-1,-1,-1,-1);//�[�W�o�@�����A�{����n
	}

	homework1(int _x, int _y, double _height, double _width) {
		this.x = _x;
		this.y = _y;
		this.height = _height;
		this.width = _width;
		this.area = _height * _width;
		this.perimeter = (_height + _width) * 2;
	}

	int getx() {
		return this.x;
	}

	int gety() {
		return this.y;
	}

	double getheight() {
		return this.height;
	}

	double getwidth() {
		return this.width;
	}

	double getarea() {
		return this.area;
	}

	double getperimeter() {
		return this.perimeter;
	}

	public String toString() {
		return "java.Rectangle[x =" + this.x + ",y = " + this.y + ",height = " + this.height + ",width = " + this.width
				+ "]" + "\narea = " + this.area + "\nperimeter =" + this.perimeter;
	}
}

public class RectangleTester {
	public static void main(String[] args) {
		homework1 rectangle1 = new homework1(15, 25, 18, 57);
		homework1 rectangle2 = new homework1(0, 12, 47, 60);
		System.out.println(rectangle1);
		System.out.println(rectangle2);
	}
}