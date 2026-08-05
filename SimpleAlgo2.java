import java.util.Scanner;
public class SimpleAlgo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No:");
		int n=sc.nextInt();
		int s=n*n;
		System.out.println("Square: "+s);
		sc.close();
	}
}
