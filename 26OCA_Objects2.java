class GG{
	int a=10;
	GG(GG g){
		a+=9;
		g.a+=10;
	}
	GG(){
		a=5;
	}
	GG gg() {
		return new GG();
	}
}
public class OCA_Objects2 {
	public static void main(String[] args) {
		GG a=new GG(new GG());
		GG b=a.gg();
		System.out.println(a.a);
		System.out.println(b.a);
	}
}
