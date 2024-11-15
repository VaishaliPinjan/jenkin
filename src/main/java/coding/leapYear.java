package coding;

public class leapYear {
	
	public static boolean isLeapYear(int yr) {
		if(yr%4==0) {
			if(yr%100==0) {
				if(yr%400==0) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isLeapYear(1999)) {
			System.out.println("leap year");
		}
		else
		{
			System.out.println(" not leap year");
		}

	}

}
