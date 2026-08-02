public class ArrayMax {

	public static void main(String[] args) {
		int[] arr = { 2,7,1,5,8,47,10,8,1,40,47,5,48 };
		
		int m=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>m) {
				m=arr[i];
			}
		}
		System.out.println("Max: "+m);
				
	}
}
