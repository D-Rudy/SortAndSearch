package datastructures;

import java.util.Arrays;

public class Sort {
	// O(N)

	// O(N * logN)
	public static void quickSort(String[] listToSort, int low, int high) {
		if (low >= high) {
			return;
		}

		int pivotIndex = Utils.partition(listToSort, low, high);

		quickSort(listToSort, low, pivotIndex - 1);
		quickSort(listToSort, pivotIndex + 1, high);
	}

	// O(N * logN)
	public static void mergeSort(String[] listToSort) {
		if (listToSort.length == 1) {
			return;
		}

		int midIndex = listToSort.length / 2 + listToSort.length % 2;

		String[] listFirstHalf = new String[midIndex];
		String[] listSecondHalf = new String[listToSort.length - midIndex];

		Utils.split(listToSort, listFirstHalf, listSecondHalf);

		System.out.print("\n Split: " + Arrays.toString(listFirstHalf) + "    " + Arrays.toString(listSecondHalf));

		mergeSort(listFirstHalf);
		mergeSort(listSecondHalf);

		Utils.merge(listToSort, listFirstHalf, listSecondHalf);

		System.out.print("\nFusion: " + Arrays.toString(listToSort));
	}

	public static void knuthShellSort(int[] listToSort) {
		int k = 1;
		int increment = (3 * k - 1) / 2;
		while (increment < listToSort.length) {
			insertionSort(listToSort, increment);
			k++;
			increment = (3 * k - 1) / 2;
		}
	}

	// Complexité = < 0(N^2)
	public static void shellSort(int[] listToSort) {
		int increment = listToSort.length / 2;
		while (increment >= 1) {
			insertionSort(listToSort, increment);
			increment = increment / 2;
		}
	}

	public static void selectionSort(int[] listToSort) {
		for (int i = 0; i < listToSort.length; i++) {
			System.out.println("\ni = " + i);
			for (int j = i + 1; j < listToSort.length; j++) {
				if (listToSort[i] > listToSort[j]) {
					Utils.swap(listToSort, i, j);
					System.out.print("Echange de l'index " + i + " par  l'index " + j + " ");
					System.out.println(Arrays.toString(listToSort));
				}
			}

		}
	}

	// O(N2)
	public static void bubbleSort(int[] listToSort) {
		for (int i = listToSort.length - 1; i > 0; i--) {
			boolean swapped = false;
			System.out.println("\ni = " + i);
			for (int j = 0; j < i; j++) {
				if (listToSort[j] > listToSort[j + 1]) {
					Utils.swap(listToSort, j, j + 1);
					swapped = true;
					System.out.print("Echange de l'index " + j + " par  l'index " + (j + 1) + " ");
					System.out.println(Arrays.toString(listToSort));

				}
			}
			if (!swapped) {
				break;
			}
		}
	}

//O(N2)
	public static void insertionSort(int[] listToSort) {
		for (int i = 0; i < listToSort.length - 1; i++) {
			System.out.println("\ni = " + i);
			for (int j = i + 1; j > 0; j--) {
				if (listToSort[j] < listToSort[j - 1]) {
					Utils.swap(listToSort, j, j - 1);
					System.out.print("Echange de l'index " + j + " avec l'index " + (j - 1) + " ");
					System.out.println(Arrays.toString(listToSort));
				} else {
					break;
				}
			}
		}
	}

	// O(N2)
	public static void insertionSort(int[] listToSort, int increment) {
		for (int i = 0; i + increment < listToSort.length; i = i + 1) {
			System.out.println("\ni = " + i + " increment = " + increment);
			for (int j = i + increment; j - increment >= 0; j = j - increment) {
				if (listToSort[j] < listToSort[j - increment]) {
					Utils.swap(listToSort, j, j - increment);
					System.out.print("Echange de l'index " + j + " avec l'index " + (j - increment) + " ");
					System.out.println(Arrays.toString(listToSort));
				} else {
					break;
				}

			}
		}
	}
}
