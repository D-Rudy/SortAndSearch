package datastructures;

public class Utils {

	public static void swap(int[] list, int iIndex, int jIndex) {
		int tmp = list[iIndex];
		list[iIndex] = list[jIndex];
		list[jIndex] = tmp;
	}
}
