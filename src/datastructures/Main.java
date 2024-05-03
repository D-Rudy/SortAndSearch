package datastructures;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int unsortedList[] = new int[] { 40, 50, 60, 20, 30, 70, 100, 80, 10, 90 };
		System.out.println(Arrays.toString(unsortedList));

		// Sort.selectionSort(unsortedList);

		// Sort.bubbleSort(unsortedList);
		System.out.println("\n**********\nInsertion sort\n**********");
		Sort.insertionSort(unsortedList);

		// Sort.shellSort(unsortedList);

		// Sort.knuthShellSort(unsortedList);

		String unsortedStringList[] = new String[] { "Fiona", "Dora", "Alex", "Jeff", "Elise", "Irene", "Gerald", "Ben",
				"Harry", "Carl", "Ophelia", "Peter", "Kriss", "Lewis", "Mary", "Nora" };

		// System.out.println(Arrays.toString(unsortedStringList));

		// Sort.mergeSort(unsortedStringList);

		// Sort.quickSort(unsortedStringList, 0, unsortedStringList.length - 1);

		// System.out.println("\n" + Arrays.toString(unsortedStringList));

		/*
		 * System.out.println(Search.linearSearch(unsortedStringList, "Harry"));
		 * System.out.println(Search.linearSearch(unsortedStringList, "Jeff"));
		 * System.out.println(Search.linearSearch(unsortedStringList, "Nora"));
		 * System.out.println(Search.linearSearch(unsortedStringList, "Patrick"));
		 */
		/*
		 * System.out.println("\nIndex de l'élément: "+
		 * Search.binarySearch(unsortedStringList, "Harry"));
		 * System.out.println("\nIndex de l'élément: "+Search.binarySearch(
		 * unsortedStringList, "Jeff"));
		 * System.out.println("\nIndex de l'élément: "+Search.binarySearch(
		 * unsortedStringList, "Nora"));
		 * System.out.println("\nIndex de l'élément: "+Search.binarySearch(
		 * unsortedStringList, "Patrick"));
		 */
		/*
		 * int low = 0; int high = unsortedStringList.length - 1;
		 * System.out.println("\nIndex de l'élément: "+
		 * Search.recursiveBinarySearch(unsortedStringList, "Harry", low, high));
		 * System.out.println("\nIndex de l'élément: "+Search.recursiveBinarySearch(
		 * unsortedStringList, "Jeff", low, high));
		 * System.out.println("\nIndex de l'élément: "+Search.recursiveBinarySearch(
		 * unsortedStringList, "Nora", low, high));
		 * System.out.println("\nIndex de l'élément: "+Search.recursiveBinarySearch(
		 * unsortedStringList, "Patrick", low, high));
		 */
		/*
		 * int jumpLength = (int) Math.sqrt(unsortedStringList.length);
		 * System.out.println("\nIndex de l'élément: "+
		 * Search.jumpSearch(unsortedStringList, "Gerald",jumpLength));
		 * System.out.println("\nIndex de l'élément: "+
		 * Search.jumpSearch(unsortedStringList, "Mary",jumpLength));
		 * System.out.println("\nIndex de l'élément: "+
		 * Search.jumpSearch(unsortedStringList, "Ophelia",jumpLength));
		 * System.out.println("\nIndex de l'élément: "+
		 * Search.jumpSearch(unsortedStringList, "Patrick",jumpLength));
		 */

		System.out.println("\nIndex de l'élément: " + Search.interpolationSearch(unsortedList, 80));

	}

}
