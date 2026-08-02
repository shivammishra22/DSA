import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertion1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array Size:");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Array Value:");
			arr[i]=sc.nextInt();
		}
		
		//or
		
//		int []arr= {7,25,8,145,45,1,5,1,6};
		
		System.out.println("Enter the value to be Inserted:");
		int value=sc.nextInt();
		sc.close();
		System.out.println(Arrays.toString(arr));
		//ArrayInsertion at END
		int []newArr=new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		newArr[newArr.length-1]=value;
		arr=newArr;
		System.out.println(Arrays.toString(arr));
	}
}
