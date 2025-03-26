package studio7;

public class Fraction {
private double denom;
private double num;

public Fraction (double denom, double num) {
	this.denom = denom;
	this.num = num;
}
private void Multiply (Fraction a) {
	denom = this.denom * a.denom;
	num = this.num * a.num;
}

private void add (Fraction a) {
	if (this.denom == a.denom) {
		denom = this.denom;
		num = this.num * a.num;
	}
	else {
		denom = this.denom * a.denom;
		num = (this.num*a.denom) + (a.num*this.denom);
	}
}

private void reciprical() {
	denom = this.num;
	num = this.denom;
	}

private void simplify() {
	
}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

