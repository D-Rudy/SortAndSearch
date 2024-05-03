package datastructures;

import java.util.Arrays;

public class Utils {

	public static void swap(int[] list, int iIndex, int jIndex) {
		int tmp = list[iIndex];
		list[iIndex] = list[jIndex];
		list[jIndex] = tmp;
	}

	public static void swap(String[] list, int iIndex, int jIndex) {
		String tmp = list[iIndex];
		list[iIndex] = list[jIndex];
		list[jIndex] = tmp;
	}

	public static void split(String[] listToSort, String[] listFirstHalf, String[] listSecondHalf) {
		int secondHalfStartIndex = listFirstHalf.length;
		for (int index = 0; index < listToSort.length; index++) {
			if (index < secondHalfStartIndex) {
				listFirstHalf[index] = listToSort[index];
			} else {
				listSecondHalf[index - secondHalfStartIndex] = listToSort[index];
			}
		}
	}

	public static void merge(String[] listToSort, String[] listFirstHalf, String[] listSecondHalf) {
		int mergeIndex = 0;

		int firstHalfIndex = 0;
		int secondHalfIndex = 0;

		while (firstHalfIndex < listFirstHalf.length && secondHalfIndex < listSecondHalf.length) {
			if (listFirstHalf[firstHalfIndex].compareTo(listSecondHalf[secondHalfIndex]) < 0) {
				listToSort[mergeIndex] = listFirstHalf[firstHalfIndex];
				firstHalfIndex++;
			} else if (secondHalfIndex < listSecondHalf.length) {
				listToSort[mergeIndex] = listSecondHalf[secondHalfIndex];
				secondHalfIndex++;
			}
			mergeIndex++;
		}
		if (firstHalfIndex < listFirstHalf.length) {
			while (mergeIndex < listToSort.length) {
				listToSort[mergeIndex++] = listFirstHalf[firstHalfIndex++];
			}
		}
		if (secondHalfIndex < listSecondHalf.length) {
			while (mergeIndex < listToSort.length) {
				listToSort[mergeIndex++] = listSecondHalf[secondHalfIndex++];
			}
		}
	}

	public static int partition(String[] listToSort, int low, int high) {

		String pivot = listToSort[low];

		int l = low;
		int h = high;

		System.out.println("\nPivot = " + pivot);

		while (l < h) {
			while (listToSort[l].compareTo(pivot) <= 0 && l < h) {
				l++;
			}
			while (listToSort[h].compareTo(pivot) > 0) {
				h--;
			}
			if (l < h) {
				swap(listToSort, l, h);

				System.out.print("Echange de: " + listToSort[l] + " et de " + listToSort[h] + " ");
				System.out.println(Arrays.toString(listToSort));
			}
		}
		if (low != h) {
			swap(listToSort, low, h);
			System.out.print("Echange de: " + listToSort[low] + " et de " + listToSort[h] + " ");
			System.out.println(Arrays.toString(listToSort));
		}

		// swap(listToSort, low, h);
		// System.out.print("Echange de: " + listToSort[low] + " et de " + listToSort[h]
		// + " ");
		// System.out.println(Arrays.toString(listToSort));

		System.out.println("\nPartition de " + Arrays.toString(listToSort) + " autour du pivot " + pivot);

		return h;
	}
}
