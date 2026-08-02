class Employee{
	class Company{
		String cname;
		int cage;
	}
	String name;
	int salary;
	Company c;
	void show() {
		System.out.println(name+" "+salary+" "+c.cname+" "+c.cage);
	}
	void setC() {
		c=new Company();
	}
}
public class ObjectReference2 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name="Ram Kumar";
		e1.salary=150000;
//		e1.show();
		e1.setC();
		e1.show();
		e1.c.cname="ABC";
		e1.c.cage=10;
		e1.show();
	}
}
