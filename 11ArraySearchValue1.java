public class ArraySearchValue1 {

	public static void main(String[] args) {
		int[] arr = { 2,7,1,5,8,47,10,8,1,40,47,5,48 };
		int value=8;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println(value+" found !");
		}else {
			System.out.println(value+" not found!");
		}
	}
}
