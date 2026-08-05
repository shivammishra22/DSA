import java.util.Scanner;

public class RecursiveAlgo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No:");
		int n=sc.nextInt();
		int f=factorial(n);
		System.out.println("Factorial: "+f);
	}
	static int factorial(int n) {
		if(n>1) {
			return n * factorial(n-1);
		}else {
			return 1;
		}
	}
}
