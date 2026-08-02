import java.util.Arrays;
import java.util.Scanner;

public class ArrayTraversing {
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
		
//		int []arr= {7,25,8,145,45,1,5,1,6};

		System.out.println("Array Values are:");
		//ArrayTraversing using for-each loop
		if(arr.length>0) {
			for(int x:arr) {
				System.out.print(x+" ");
			}
			System.out.println();
		}else {
			System.out.println("No element to traverse!");
		}
		
		//ArrayTraversing Using Standard For Loop
		if(arr.length>0) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}else {
			System.out.println("No element to traverse!");
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
