import java.util.Arrays;
import java.util.Scanner;

public class DSA_Array_Problem4_Reverse_Range {

	public static void main(String[] args) {
		
		int[] arr = { 2,7,1,5,8,4,6,9,3,7,5};
		System.out.println(Arrays.toString(arr));
		//reverse the array
		int a=2,b=6,t=b-a+1;
		for(int x=0;x<t/2;x++) {
			int temp = arr[a+x]; 
			arr[a+x] = arr[b-x]; 
			arr[b-x] = temp; 
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
