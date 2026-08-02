import java.util.Arrays;
import java.util.Scanner;

public class DSA_Array_RemoveDuplicate2 {

	public static void main(String[] args) {

		int[] arr = { 2,7,1,5,8,47,10,8,1,40,5,47,48,5 };
		System.out.println(Arrays.toString(arr));
		//Remove duplicate values without sorting
        int unique[]=new int[arr.length];
		int j = 0;
        for (int x:arr) {
	    		boolean flag=true;
	    		for(int i=0;i<j;i++) {
	    			if (x==unique[i]) {
	    				flag=false;
	    				break;
	    			}
	    		}
	    		if(flag) {
	    			unique[j++] = x;
	    		}
        }
        // Create new array of unique values only
        int newArray[]=new int[j];
        for (int i = 0; i < newArray.length; i++) {
        		newArray[i] = unique[i];
        }
        //[2, 7, 1, 5, 8, 47, 10, 40, 48]
        arr=newArray;
        
		System.out.println(Arrays.toString(arr));
		
		
	}
}
