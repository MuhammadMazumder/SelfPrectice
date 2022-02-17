package january2022;

public class Use_of_java_continue {
	public static void main(String[] args) {

		System.out.println("\n---------------------------------outcome1---------------------\n");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;

			}
			System.out.println("the value is: " + i);
		}
		System.out.println("\n-----------------------outcome2-------------------------\n");
		int m = 1;
		do {
			System.out.println("the value of: " + m);
			if (m == 6) {
				break;

			}
			m = m + 2;
		} while (m <= 7);
		System.out.println("\n-------------------------outcome3----------------------\n");
		for (int i = 1; i <= 10; i += 2) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("\n---------------------------------outcome4-----------------------------\n");
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(i + j);
			}

		}
		System.out.println("\n--------------------outcome5------------------------------------\n");
		for (int i = 2; i <= 10; i += 1) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);

		}
		System.out.println("\n-------------------outcome6--------------------------\n");
		int i = 2;

	}

}
