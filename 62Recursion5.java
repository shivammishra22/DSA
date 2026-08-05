public class Recursion5 {
	public static void main(String[] args) {
		System.out.println("Hi Main");
		m1(2);
		System.out.println("Bye Main");
	}
	static void m1(int x) {
		System.out.println("Hello M1");
		if(x-->0) {
			m1(x--);
			System.out.println("OK M1 "+x);
		}
		System.out.println("Bye M1");
	}
}
