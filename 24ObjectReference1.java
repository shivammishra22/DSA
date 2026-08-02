class Student{
	String name;
	int roll;
	void show() {
		System.out.println(name+" "+roll);
	}
}
public class ObjectReference1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3=s1;
		s1.name="Ram";
		s1.roll=101;
		s2.show();
		s1.show();
		s3.show();
		s1=s2;
		s2.show();
		s1.show();
		s3.show();
	}
}
