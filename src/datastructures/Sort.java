package datastructures;

import java.util.Arrays;

public class Sort {

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
}
