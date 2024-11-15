package array;

public class equalityOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,5};
		int[] b= {1,2,7,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
                if(a[i]==b[j]) {
                	System.out.println(a[i] + " " +a[j]);
                }
		}
	}
	
	}
}
