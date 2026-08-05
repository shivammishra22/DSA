import java.util.Scanner;

public class ConditionalAlgo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No:");
		int n1=sc.nextInt();
		System.out.println("Enter a No:");
		int n2=sc.nextInt();
		if(n1>n2) {
			System.out.println(n1+" is Greater than "+n2);
		}else if(n2>n1){
			System.out.println(n2+" is Greater than "+n1);
		}else {
			System.out.println(n1+" is equal to "+n2);
		}
		sc.close();
	}
}
