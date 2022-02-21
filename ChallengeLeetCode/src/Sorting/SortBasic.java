package Sorting;

public class SortBasic {
	private static void printArray(int i, int[] ar) {
		System.out.print("i = " + i + ": ");
		for (int j = 0; j < ar.length; j++) {
			System.out.print(ar[j] + " ,");
		}
		System.out.println();
	}

	public static void bubbleSort(int[] ar) {
		int n = ar.length;
		int temp;
		for (int i = 0; i < n; i++) {
			boolean isSorted = true;
			for (int j = 0; j < n - 1; j++) {
				if (ar[j] > ar[j + 1]) {
					isSorted = false;
					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
			printArray(i, ar);
			if (isSorted) {
				break;
			}
		}
	}

	public static void selectionSort(int[] ar) {
		int n = ar.length;
		int minIndex;
		for (int i = 0; i < n; i++) {
			minIndex = i;
			for (int j = i + 1; j < n; j++) {
				// Tim min [i,n]
				if (ar[j] < ar[minIndex]) {// tim vi tri cua so nho nhat cua doan ben phai vi tri i
					minIndex = j;
				}
			}
			if (minIndex != i) {// neu vi tri cua so nho nhat khac voi so ban dau thi tien hanh trao dooi
				int t = ar[i];
				ar[i] = ar[minIndex];
				ar[minIndex] = t;

			}
			printArray(i, ar);
		}
	}

	public static void insertSort(int[] ar) {
		int n = ar.length;
		for (int i = 1; i < n; i++) {
			// Chen ar[i] vao day 0->i-1
			int ai = ar[i];// luu tru gia cua phan tu thu i
			int j = i - 1;// lay ra phan tu dau tien
			while (j >= 0 && ar[j] > ai) {
				ar[j + 1] = ar[j];
				j--;
			}
			ar[j + 1] = ai;
			printArray(i, ar);
		}
	}

	public static void main(String[] args) {
		int[] ar2 = { 1, 2, 1, 2, 1, 3, 2 };
		int[] ar3 = { 5, 3, 2, 7, 8, 1, 2 };
		int[] ar4 = { 1, 2, 3, 4, 5, 8, 7 };
		int n = 9;
		int n2 = 7;

		bubbleSort(ar2);
		selectionSort(ar3);
		insertSort(ar4);
	}
}
