/*
 * [C]60
 * [TA's Advise]
 * 1. 昱晢如果有有對程式上的任何問題請和助教聯繫.
 * */
import java.util.ArrayList;

class GradeAverage {
	String name;
	int num;

	GradeAverage() {
	}

	GradeAverage(String _name, int _num) {
		this.name = _name;
		this.num = _num;
	}

	public String toString() {
		return this.name + " = " + this.num;
	}
}

public class GradeAnalyzer {
	int input = 0;
	double total = 0, avg = 0, Std = 0;
	ArrayList<Double> sum = new ArrayList<Double>();
	GradeAverage[] interval = new GradeAverage[11];
	boolean First = true;
}