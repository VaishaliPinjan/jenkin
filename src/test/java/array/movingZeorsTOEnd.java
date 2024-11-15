package array;

public class movingZeorsTOEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] a= {1,0,3,0,4};
		
		int counter=0;
		for(int i=0;i<a.length;i++) {
                if(a[i]!=0) {
                	a[counter]=a[i];
                }	
            	System.out.println(a[i]);
	}
	}
}
