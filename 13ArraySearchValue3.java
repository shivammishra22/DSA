public class ArraySearchValue3 {

	public static void main(String[] args) {
		int[] arr = { 2,7,1,5,8,47,10,8,1,40,47,5,48 };
		int value=8;
		int count=0;
		String index="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				count++;
				index += i+" ";
			}
		}
		if(count==0) {
			System.out.println(value+" not found!");
		}else {
			System.out.println(value+" found "+count+" times at "+index);
		}
	}
}
