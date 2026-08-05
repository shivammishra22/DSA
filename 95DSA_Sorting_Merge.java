import java.util.Arrays;

public class DSA_Sorting_Merge {

	public static void divide(int arr[],int lower, int upper) {
		if (lower!= upper) {
			int mid=(lower+upper)/2; //lower+ (upper-lower)/2
			divide(arr,lower,mid);
			divide(arr,mid+1,upper);
			conquer(arr,lower,mid,upper);
		}    
	}
	
	public static void conquer(int arr[],int lower,int mid, int upper) {
		int merged[]=new int[upper-lower+1];
		int idx1=lower;
		int idx2=mid+1;
		int x=0;
		while(idx1 <= mid && idx2 <= upper) {
			if(arr[idx1] <= arr[idx2]) { //Increasing
//			if(arr[idx1] >= arr[idx2]) { //Decreasing
				merged[x++]=arr[idx1++];
			}else {
				merged[x++]=arr[idx2++];
			}
		}
		while(idx1 <= mid) {
			merged[x++]=arr[idx1++];
		}
		while(idx2 <= upper) {
			merged[x++]=arr[idx2++];
		}
		
		for(int i=0,j=lower; i<merged.length; i++,j++) {
			arr[j]=merged[i];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 56, 8, 2, 56, 14, 6, 5, 2, 56, 14, 5, 89, 1 };
		// printing the original array
		System.out.println(Arrays.toString(arr));
		
		divide(arr,0, arr.length-1);
		
		// printing the sorted array
		System.out.println(Arrays.toString(arr));
	}
}
Displaying DSA_Sorting_M
