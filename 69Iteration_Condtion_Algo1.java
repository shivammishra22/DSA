import java.util.Scanner;

public class Iteration_Condtion_Algo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No:");
		int n=sc.nextInt();
		int p=n;
		int c=0;
		while(n!=0) {
			c++;
			n=n/10;
		}
		System.out.println("No of digits in "+p+" are: "+c);
		sc.close();
	}
}
