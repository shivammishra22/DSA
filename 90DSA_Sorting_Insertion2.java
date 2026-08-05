import java.util.Arrays;

public class DSA_Sorting_Insertion2 {

	public static void main(String[] args) {
		int arr[]= {4,56,8,2,56,14,6,5,2,56,14,5};
		// printing the array
		System.out.println(Arrays.toString(arr));
		
		int len = arr.length; 
		//Sorting in Decreasing order
		for (int i = 1; i < len; i++) {
        	int key = arr[i]; 
        	int j= i - 1;
            while ( j >= 0 && key > arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        
        //printing the sorted array
        System.out.println(Arrays.toString(arr));
	}
}
