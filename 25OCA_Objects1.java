class AAAA{
	int a=10;
	AAAA foo(AAAA a) {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(a.a);
		a.a=this.a+9;
		System.out.println(this.a);
		return a;
	}
}
public class OCA_Objects1 {
	public static void main(String[] args) {
		AAAA a=new AAAA();
		AAAA b=a.foo(a);
		AAAA c=new AAAA();
		b=c;
		c=a;
		System.out.println(a.a);
		System.out.println(b.a);
		System.out.println(c.a);
	}
}
