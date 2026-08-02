import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletion4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter Array Size:");
//		int n=sc.nextInt();
//		int []arr=new int[n];
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("Enter Array Value:");
//			arr[i]=sc.nextInt();
//		}
		
		//or
		
		int []arr= {7,25,8,145,45,1,5,1,6};

		System.out.println("Enter the value:");
		int value=sc.nextInt();
		
		sc.close();

		//ArrayDeletion  at given value
		boolean flag=false;
		for(int x:arr) {
			if(x==value) {
				flag=true;
				break;
			}
		}
		if(flag) {
			int []newArr=new int[arr.length-1];
			System.out.println(Arrays.toString(arr));
			for(int i=0;i<arr.length-1;i++) {
				if(flag && arr[i]!=value) {
					newArr[i]=arr[i];
				}else {
					flag=false;
					newArr[i]=arr[i+1];
				}
			}
			arr=newArr;
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println("Value not found!");
		}
	}
}
