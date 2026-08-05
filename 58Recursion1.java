public class Recursion1 {
	public static void main(String[] args) {
		System.out.println("Hi Main");
		m1();
		System.out.println("Bye Main");
	}
	static void m1() {
		System.out.println("Hello M1");
		m1();
		System.out.println("Bye M1");
	}
}
