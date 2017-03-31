package arrayTopicudemyCourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static Scanner inputFromKeyBoard = new Scanner(System.in);
	
	public static void main(String[] args) {
//		int[] listOfIntegers = {106, 26, 81, 5, 15};
//		Arrays.sort(listOfIntegers);
//		for (int j = listOfIntegers.length; j >= 0; j--) {
//			System.out.println(listOfIntegers[j-1]);
//		}
		
		
		int[] arrayofIntergers01 = getIntegers(4);
		printArray(arrayofIntergers01);
		sortInteger(arrayofIntergers01);
		Arrays.copyOf(arrayofIntergers01, 10);
		
	}
	
	public static int[] getIntegers (int numberOfInputs) {
		int[] listofIntegers = new int[numberOfInputs];
		System.out.println("Enter "+ numberOfInputs +" integers input");
		for (int i = 0; i < listofIntegers.length; i++) {
			listofIntegers[i] = inputFromKeyBoard.nextInt();
		}
		return listofIntegers;
	}
	
	public static void printArray (int[] arrayInput) {
		for (int i = 0; i < arrayInput.length; i++) {
			System.out.println("Your "+ (i+1) +" input is ..." + arrayInput[i]);
		}
	}
	
	public static void sortInteger (int[] arrayInput) {
		System.out.println("Value before sorting: ");
		for (int i = 0; i < arrayInput.length; i++) {
			System.out.print(arrayInput[i] + " ");
		}
		System.out.println();
		Arrays.sort(arrayInput);
		System.out.println("Value after sorting: ");
		for (int i = 0; i < arrayInput.length; i++) {
			System.out.print(arrayInput[i] + " ");
		}
	}
}
