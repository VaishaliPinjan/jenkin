package coding;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        if(isPrime(15)) {
    		System.out.println("this is prime number");
        }
        else {
    		System.out.println("this is not prime number");
        }
	}
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					return false;
				}	
			}
		}
		return true;
	}

}
