public class Recursion4 {
	static int x=1;
	public static void main(String[] args) {
		System.out.println("Hi Main");
		m1();
		System.out.println("Bye Main");
	}
	static void m1() {
		System.out.println("Hello M1");
		if(x<=2) {
			System.out.println(++x);
			m1();
			System.out.println("OK M1");
			System.out.println(++x);
		}
		System.out.println("Bye M1");
	}
}
