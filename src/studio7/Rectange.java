package studio7;

public class Rectange {
	private int length;
	 private int width;
	
	public Rectange(int l, int w) {
	 this.length = l;
	 this.width = w;
	}
	
	private int area() {
		return length*width;
	}
	
	private int perimeter() {
		return 2*length + 2*width;
	}
	
	private boolean smallerThan(Rectange a) {
		if (this.area() < a.area()) {
			return true;
		} else {
		
		return false;
		}
		
		
	}
	
	
	private boolean isSquare() {
		if (length == width) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectange friend = new Rectange(1,1);
Rectange frinds = new Rectange (1,2);

// returns the area
//System.out.println(friend.area());


//System.out.println(friend.perimeter());

// returns true 
//System.out.println(friend.smallerThan(frinds));

System.out.println(frinds.isSquare());
System.out.println(friend.isSquare());

	}

}


















