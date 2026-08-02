import java.util.Scanner;

public class DSA_Array_Problem3_MissingNo {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter array size:");
//		int n=sc.nextInt();
//		int []arr=new int[n];
//		System.out.println("Enter array elements:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=sc.nextInt();
//		}
//		sc.close();

//		int[] arr = { 3,0,1,4 };
		int[] arr = { 2,5,6,7,3 };
//		int[] arr = { 13,10,11,14 };
		
		int actualSum=0;
		for(int x:arr) {
			actualSum += x;
		}
		
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		int expectedSum=min;
		for(int i=1;i<=arr.length;i++) {
			expectedSum += min+i ;
		}
		
		System.out.println("Missing No.: "+(expectedSum-actualSum));
	}
}
