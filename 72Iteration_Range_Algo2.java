import java.util.Scanner;

public class Iteration_Range_Algo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i+=3) {
			System.out.println(i);
		}
		sc.close();
	}
}
//Algo
/*
1. Read n
2. Repeat, for (i = 1 to n) 
	a) Print, i 
	b) Set i=i+3
3. Exit
*/
