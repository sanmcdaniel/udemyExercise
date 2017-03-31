package courseFromUdemy;

import java.util.Iterator;

public class JavaTraining1 {
	public static void main(String[] args) {
		whileExerciseOne(1,20);
	}

	private static void datatypeExerciseOne() {
		byte byteValue = 127;
		short shortValue = 9999;
		int intValue = -12_345;
		long longValue = 50_000 + 10 * (byteValue + shortValue + intValue);
		System.out.println(longValue);
	}

	private static void datatypeExerciseTwo() {
		double pound = 190d;
		double kilogram = pound * 0.45359237d;
		System.out.println(kilogram);
	}

	private static void datatypeExerciseThree() {
		char myChar = '\u00a3';
		System.out.println(myChar);
	}

	private static void operatorExcerciseOne() {
		double myDouble = 20d;
		double mySecondDouble = 80d;
		myDouble = (myDouble + mySecondDouble) * 25d;
		System.out.println(myDouble);
		double myThirdDouble = myDouble % 40d;
		System.out.println(myThirdDouble);
		if (myThirdDouble <= 20) {
			System.out.println("Total was over the limit");
		}
	}

	private static void ifThenElseExerciseOne() {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}

		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		} else {
			bonus = 111;
		}

	}

	private static void methodExerciseOne() {
		displayHighScorePosition("sand", 2);
		System.out.println(calculateHighScorePosition(1500));
		System.out.println(calculateHighScorePosition(900));
		System.out.println(calculateHighScorePosition(400));
		System.out.println(calculateHighScorePosition(50));
	}

	private static void displayHighScorePosition(String playersName, int position) {
		System.out.println(playersName + " managed to get into position ");
		System.out.println(position + " on the high score table");
	}

	private static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}
	}

	private static void overLoadingExcerciseOne() {
		System.out.println(calcFeetAndInchesToCentimeters(-5, 11));
		System.out.println(calcFeetAndInchesToCentimeters(8));
	}

	private static double calcFeetAndInchesToCentimeters(double feetValue, double inchesValue) {
		if (feetValue >= 0 && inchesValue >= 0) {
			double valueinCent = ((feetValue * 12) + inchesValue) * 2.54;
			return valueinCent;
		} else {
			return -1;
		}
	}

	private static double calcFeetAndInchesToCentimeters(double inchesValue) {
		if (inchesValue >= 0) {
			double valueinCent = inchesValue * 2.54;
			return valueinCent;
		} else {
			return -1;
		}
	}

	private static void switchCaseExerciseOne() {
		char charValue = 'C';
		switch (charValue) {
		case 'A':
			System.out.println("Case A and Value is: " + charValue);
			break;
		case 'B':
			System.out.println("Case B and Value is: " + charValue);
			break;
		case 'C':
			System.out.println("Case C and Value is: " + charValue);
			break;
		case 'D':
			System.out.println("Case D and Value is: " + charValue);
			break;
		case 'E':
			System.out.println("Case E and Value is: " + charValue);
			break;

		default:
			System.out.println("Not found!");
			break;
		}
	}

	private static void forExcerciseOne() {
		for (double i = 2; i <= 8; i++) {
			System.out.println(String.format("%.2f", calculateInterest(10_000, i)));
		}
	}

	private static void forExcerciseTwo() {
		for (double i = 8; i >= 2; i--) {
			System.out.println(String.format("%.2f", calculateInterest(10_000, i)));
		}
	}

	private static double calculateInterest(double amount, double interestRate) {
		return amount * (interestRate / 100);
	}

	private static void forExcerciseThree(int minRange, int maxRange) {
		int j = 0;
		for (int i = minRange; i <= maxRange; i++) {
			if (isPrime(i)) {
				j++;
				System.out.print(i + " is prime number");
				System.out.println(" and total number of prime number is " + j + ".");
				if (j == 3)
					break;
			}
		}
	}

	private static boolean isPrime(int n) {
		if (n == 1 || n == 0)
			return false;
		for (int i = 2; i <= (long) Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	private static void whileExerciseOne(int minRange, int maxRange) {
		int i = minRange;
		int j = 0;
		while (i<=maxRange) {
			if (isEvenNumber(i)) {
				j++;
				System.out.println(i + " is an even number. Number of even number found is " + j);
				if (j==5) break;
			} else {
				System.out.println(i + " is an odd number. ");
			}
			i++;
		}
	}

	private static boolean isEvenNumber(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
