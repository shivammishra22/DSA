public class DSA_Array_K_Max2 {

	public static void main(String[] args) {
		int k=3;
		int[] arr = { 3,177,1,5,8,47,10,8,1,40,48,5,47 };
		//without sorting & without removing duplicates
		int max=arr[0];
		int min=arr[0];
		for(int a:arr) {
			if(a>max ) {
				max=a;
			}
			if(a<min ) {
				min=a;
			}
		}
		if(k==1) {
			System.out.println("K_Max= "+max);
		}else if(k<arr.length) {
			int temp=max;
			for(int i=1;i<=k-1;i++) {
				max=min;
				for(int a:arr) {
					if(a>max && a< temp) {
						max=a;
					}
				}
				temp=max;
			}
			System.out.println("K_Max= "+temp);
		}
	}
}
