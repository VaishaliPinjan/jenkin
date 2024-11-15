package array;

public class peakElementbiggerThanItsNeighbour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,20,30,80,20,10};
		int p=peakEle(a);
		System.out.println(a[p]);
	}
	public static int peakEle(int[] a) {
		int c=1;
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
			if(a[i]<=a[j]) {
				c=j;
			}
			break;
		}
	}
		return c;
	}
}
