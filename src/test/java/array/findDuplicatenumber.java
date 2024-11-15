package array;

public class findDuplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {111,333,555,777,333,555,444};
		duplicate(a);
	}
	public static void duplicate(int[] b) {
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]==b[j]) {
					System.out.println(b[i]);
				}
			}
		}
	}

}
