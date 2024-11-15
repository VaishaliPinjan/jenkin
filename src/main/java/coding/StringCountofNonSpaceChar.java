package coding;

public class StringCountofNonSpaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String ch="this is a string";
		String ch="thisisastring";
		int count = 0;
		for(int i=0;i<=ch.length()-1;i++) {
			
			if(ch.charAt(i) != ' ') {
				count++;
			}
						
		}
		System.out.println(count);

	}

}
