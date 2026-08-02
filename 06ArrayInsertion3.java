import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertion3 {
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
		System.out.println("Enter the index:");
		int index=sc.nextInt();
		sc.close();
		
		System.out.println(Arrays.toString(arr));
		//ArrayInsertion at given index
		if(index<0 || index>=arr.length) {
			System.out.println("Index is Out of Array Size!");
		}else {
			int []newArr=new int[arr.length+1];
			newArr[index]=value;
			for(int i=0;i<arr.length;i++) {
				if(i<index) {
					newArr[i]=arr[i];
				}else {
					newArr[i+1]=arr[i];
				}
			}
			arr=newArr;
			System.out.println(Arrays.toString(arr));
		}
	}
}
