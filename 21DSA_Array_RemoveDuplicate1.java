import java.util.Arrays;
import java.util.Scanner;

public class DSA_Array_RemoveDuplicate1 {

	public static void main(String[] args) {

		int[] arr = { 2,7,1,5,8,47,10,8,1,40,5,47,48,5 };
		System.out.println(Arrays.toString(arr));
		//Sorting
		Arrays.sort(arr); //[1, 1, 2, 5, 5, 5, 7, 8, 8, 10, 40, 47, 47, 48]
		System.out.println(Arrays.toString(arr));
		
		//Remove duplicate values 
		int j = 1;
        for (int i = 0; i < arr.length - 1; i++) {
        // If current element is not equal to next element then store that current element
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i+1];
            }
        }
 
        // Create new array of unique values
        int newArray[]=new int[j];
        for (int i = 0; i < j; i++) {
        		newArray[i] = arr[i];
        }
	
        arr=newArray;
        //[1, 2, 5, 7, 8, 10, 40, 47, 48]

		System.out.println(Arrays.toString(arr));
		
		
	}
}
