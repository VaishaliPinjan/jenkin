package coding;

public class duplicateChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hackerearth".toLowerCase();
		char[] character = s.toCharArray();

		boolean isNotDuplicate = false;

		for (int i = 0; i < s.length(); i++) {
			boolean isDuplicate = false;

			for (int j = i + 1; j < s.length(); j++) {
				if (character[i] == character[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (isDuplicate) {
				System.out.println(character[i]);
				isNotDuplicate = true;
			}
		}

		if (!isNotDuplicate) {
			System.out.println("No duplicates are found!");
		}
	}
}
