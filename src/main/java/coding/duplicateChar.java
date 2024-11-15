package coding;

public class duplicateChar {

	public static void main(String[] args) {
		
		String s = "hackerearth";
		//char[] character = s.toCharArray();

		boolean isNotDuplicate = false;

		for (int i = 0; i < s.length(); i++) {
			boolean isDuplicate = false;

			for (int j = i + 1; j < s.length(); j++) {
		       if (s.charAt(i) == s.charAt(j)) {
					isDuplicate = true;
					break;
				}
			}

			if (isDuplicate) {
				System.out.println(s.charAt(i));
				isNotDuplicate = true;
			}
		}

		if (!isNotDuplicate) {
			System.out.println("No duplicates are found!");
		}
	}

}
