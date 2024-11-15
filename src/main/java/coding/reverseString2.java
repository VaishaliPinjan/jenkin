package coding;



public class reverseString2 {


	public static void main(String[] args) {
		
		String input="This is a string";
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			reverse =reverse + input.charAt(i);
		}
		
		System.out.println(reverse);
		
	
	}

}
