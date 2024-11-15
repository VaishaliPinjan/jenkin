package array;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,6};
		int c=1;
		for(int i=0;i<a.length;i++) {
                if(c!=a[i]) {
                	System.out.println(c);
                	break;
                }
                c++;
	}
	
	}
}
