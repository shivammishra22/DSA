import java.util.Arrays;
import java.util.Scanner;

public class ArrayCreation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Array Value:");
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		for(int x=0;x<arr.length;x++) {
			System.out.print(arr[x]+" ");
		}
		System.out.println();
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}
