import java.util.Arrays;

public class SearchingBinary {

	public static void main(String[] args) {
		int arr[]= {2,7,8,11,14,14,78,89,56};
		
		Arrays.sort(arr);
		//[2, 7, 8, 11, 14, 14, 56, 78, 89]
		
		int value=14;
		boolean flag=true;
		int lower=0,upper=arr.length-1;
		while(lower <= upper){
            int mid = (lower + upper) / 2;
            if(value < arr[mid]){
                upper = mid -1;
            }
            else if(value > arr[mid]){
                lower = mid + 1;
            }else {
            	System.out.println(value+" found at "+mid);
        		flag=false;
        		break;
            }
        }
		if(flag) {
			System.out.println(value+" NOT found");
		}
		
		//Assignment:
		//print all occurrences
	}

}
