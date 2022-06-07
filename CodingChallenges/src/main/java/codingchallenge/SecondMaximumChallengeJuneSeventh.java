package codingchallenge;

import java.util.Arrays;

public class SecondMaximumChallengeJuneSeventh {

	public static void main(String[] args) {
		System.out.println("Inputs:");

		int numOfTestCases = 3;

		System.out.println(numOfTestCases);

		int[][] numberInputs = { { 1, 2, 3 }, { 10, 15, 5 }, { 100, 999, 500 } };

		System.out.println(numberInputs[0][0] + " " + numberInputs[0][1] + " " + numberInputs[0][2]);
		System.out.println(numberInputs[1][0] + " " + numberInputs[1][1] + " " + numberInputs[1][2]);
		System.out.println(numberInputs[2][0] + " " + numberInputs[2][1] + " " + numberInputs[2][2]);
		System.out.println("\nOutputs:");

		findMiddleNumber(numOfTestCases, numberInputs);
	}

	public static void findMiddleNumber(int numOfTestCases, int[][] intArray) {

		for (int i = 0; i < numOfTestCases; i++) {

			int[] innerArray = intArray[i];

			Arrays.sort(innerArray);

			System.out.println(innerArray[1]);

		}

	}

}
