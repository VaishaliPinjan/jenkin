package array;

import java.util.HashSet;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,5,1};
		
		HashSet<Integer> s=new HashSet<Integer>();
		for(int n:a) {
			s.add(n);
			System.out.println(s);
		}
	}

}
