import java.util.Arrays;

public class DSA_Sorting_Bubble1 {

	public static void main(String[] args) {
		int arr[]= {4,56,8,2,56,14,6,5,2,56,14,5};
		
		// printing the array
		System.out.println(Arrays.toString(arr));

		int len = arr.length; 
		//Sorting in Increasing order
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        //printing the sorted array
        System.out.println(Arrays.toString(arr));
	}
}
