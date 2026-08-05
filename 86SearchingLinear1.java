public class SearchingLinear1 {

	public static void main(String[] args) {
		int arr[]= {4,56,8,2,56,14,6,5,2,56,14,5};

		int value=14;
		boolean flag=false;
		int x;
		for(x=0;x<arr.length;x++) {
			if(arr[x]==value) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println(value+" found at "+ x+"!");
		}else {
			System.out.println(value+" not found!");
		}
	}

}
