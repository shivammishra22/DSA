import java.util.Scanner;

public class Iteration_Condtion_Algo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String choice;
		do {
			System.out.println("Enter a No:");
			int n=sc.nextInt();
			int r=n*n;
			System.out.println("Square: "+r);
			
			System.out.println("Do u wanna continue? [yes/no]");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		
		sc.close();
	}
}
//Algo
/*
1. Repeat, do
	a. Read n
	b. Set r=n*n 
	c. Print, Square is r
	c. Print, Yes to Continue
	d. Read choice
	while (choice == yes) 
2. Exit
*/
