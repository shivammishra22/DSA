import java.util.Scanner;

public class Iteration_Range_Algo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		sc.close();
	}
}
