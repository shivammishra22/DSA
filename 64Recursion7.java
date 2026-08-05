public class Recursion7 {
	public static void main(String[] args) {
		System.out.println("Hi Main");
		m1(2);
		System.out.println("Bye Main");
	}
	static void m1(int x) {
		System.out.println("Hello M1 "+x);
		if(--x>0) {
			System.out.println("OK M1");
			m1(x-1);
		}else {
			System.out.println("Incapp");
		}
		System.out.println("Bye M1 "+x);
	}
}
