import java.util.Arrays;

public class DSA_Sorting_Quick {

	public static void quickSort(int arr[],int start, int end) {
		if (start < end) {
			int pivot, lower, upper;
			pivot = start;
			lower = start + 1;
			upper = end;
			while (lower <= upper) {
				while (lower <= upper && arr[lower] <= arr[pivot]) {
					lower++;
				}
				while (lower <= upper && arr[upper] > arr[pivot]) {
					upper--;
				}
				if (lower < upper) {
					int t = arr[lower];
					arr[lower] = arr[upper];
					arr[upper] = t;
				}
			}
			int t = arr[pivot];
			arr[pivot] = arr[upper];
			arr[upper] = t;
			
			quickSort(arr,start, upper - 1);
			quickSort(arr,upper + 1, end);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 56, 8, 2, 56, 14, 6, 5, 82, 56, 14, 5, 89, 1 };
		// printing the original array
		System.out.println(Arrays.toString(arr));

		int len = arr.length;

		quickSort(arr,0, len-1);
		
		// printing the sorted array
		System.out.println(Arrays.toString(arr));
	}
}
