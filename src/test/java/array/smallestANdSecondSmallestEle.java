package array;

public class smallestANdSecondSmallestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,3,4,5,6};
		int c=0;
		for(int i=0;i<a.length;i++) {
				if(a[i]<a[i+1]) {
					c++;
				}
			}
		System.out.println(a[c]+ " " +a[c+1]);
		}
	}

