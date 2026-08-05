public class SearchingLinear2 {

	public static void main(String[] args) {
		int arr[]= {4,56,8,2,56,14,6,5,2,56,14,5};

		int value=14;
		int count=0;
		int x;
		String index="";
		for(x=0;x<arr.length;x++) {
			if(arr[x]==value) {
				count++;
//				System.out.println(value+" found at "+ x+"!");
				index += x+" ";
			}
		}
		if(count>0) {
//			System.out.println(value+" found "+ count+" times!");
			System.out.println(value+" found "+ count+" times! and at "+index);
		}else {
			System.out.println(value+" not found!");
		}
	}

}
