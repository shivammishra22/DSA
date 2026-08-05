public class Recursion8 {
	public static void main(String[] args) {
		System.out.println("Hi Main");
		int r=m1(2);
		System.out.println("Bye Main"+r);
	}
	static int m1(int x) {
		System.out.println("Hello M1");
		if(x>0) {
			x = x + m1(--x);
			System.out.println("OK M1 "+x);
		}
		System.out.println("Bye M1");
		return x;
	}
}

//Algo
/*
1. Print, Hi Main
2. function, m1(x)
	a) Print, Hello M1
	b) Check if(x>0) then,
		i) Set x=x + m1(--x)
		ii) Print, OK M1 and x
	c) Print, Bye M1
	d) return x
3. Set r = m1(2)
4. Print, Bye Main and r
5. Exit
*/
