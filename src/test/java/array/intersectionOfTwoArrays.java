package array;

public class intersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,4,2,3,5,4};
		int[] b= {1,4,3,2,7,4};
		
		for(int i=0;i<a.length && i<b.length;i++) {
                if(a[i]==b[i]) {
                	System.out.println(a[i] + " " +b[i]);
                }
		
	}
	
	}
}
