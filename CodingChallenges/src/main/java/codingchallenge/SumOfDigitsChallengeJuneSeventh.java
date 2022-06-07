package codingchallenge;

public class SumOfDigitsChallengeJuneSeventh {

	public static void main(String[] args) {

		System.out.println("Inputs:");

		int numOfStrings = 3;

		System.out.println(numOfStrings);

		String[] inputStrings = { "hello12345goodbye", "a1b2c3d4", "ab1231da" };

		System.out.println(inputStrings[0]);
		System.out.println(inputStrings[1]);
		System.out.println(inputStrings[2]);
		System.out.println("Outputs:");

		digitSum(numOfStrings, inputStrings);

	}

	public static void digitSum(int numOfStrings, String[] arrayOfStrings) {

		int sum = 0;
		for (int n = 0; n < numOfStrings; n++) {
			String s1 = arrayOfStrings[n];

			char[] arr = s1.toCharArray();

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < 57 && arr[i] > 48) {

					Character charValue = arr[i];
					String charString = charValue.toString();
					int value = Integer.parseInt(charString);

					sum = sum + value;

				}
			}
			System.out.println(sum);
			sum = 0;
		}

	}

}
