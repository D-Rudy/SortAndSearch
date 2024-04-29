package datastructures;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int unsortedList[] = new int[] { 40, 50, 60, 20, 10, 70, 100, 30, 80, 90 };
		System.out.println(Arrays.toString(unsortedList));

		// Sort.selectionSort(unsortedList);

		//Sort.bubbleSort(unsortedList);
		
		Sort.insertionSort(unsortedList);
	}

}
