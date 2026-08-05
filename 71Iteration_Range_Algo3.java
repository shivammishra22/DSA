import java.util.Scanner;

public class Iteration_Range_Algo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No:");
		int n = sc.nextInt();
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
		}
		System.out.println("Factorial of " + n + " is " + f);
		sc.close();
	}
}
//Algo
/*
1. Read n
2. Set f=1 
3. Repeat, for (i = 1 to n) 
	a) Set f=f*i
4. Print, Factorial of n is f
5. Exit
*/
