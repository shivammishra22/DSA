import java.util.Arrays;
import java.util.Scanner;

public class DSA_Array_K_Max1 {

	public static void main(String[] args) {
		int k=2;
		int[] arr = { 2,7,1,5,8,47,10,40,48,48,7 };
		System.out.println(Arrays.toString(arr));
		//Sorting
		Arrays.sort(arr); 
		System.out.println(Arrays.toString(arr));
		//Remove duplicate values 
		int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
        		if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i+1];
            }
        }
        int newArray[]=new int[j];
        for (int i = 0; i < j; i++) {
        		newArray[i] = arr[i];
        }
        arr=newArray;
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[arr.length-k]);
		
	}
}
