package studio7;

public class Die {
	private int n;
	
	public Die( int n) {
		this.n = n;
	}
	private int randomNum() {
		return (int) (Math.random() * n) + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die friend = new Die(6);
		System.out.println(friend.randomNum());

	}

}
