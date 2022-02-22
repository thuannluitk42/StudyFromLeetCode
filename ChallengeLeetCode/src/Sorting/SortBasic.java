package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

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

	// phan merge sort

	public static int[] merge(int[] a1, int[] a2) {
		int n = a1.length + a2.length;
		int[] result = new int[n];
		int i = 0, i1 = 0, i2 = 0;
		while (i < n) {
			if (i1 < a1.length && i2 < a2.length) { // a1 & a2 != rong
				if (a1[i1] <= a2[i2]) { // a1 nho hon
					result[i] = a1[i1];
					i++;
					i1++;
				} else { // a2 nho hon
					result[i] = a2[i2];
					i++;
					i2++;
				}
			} else { // a1 rong hoac a2 rong
				if (i1 < a1.length) {// a1 ok
					result[i] = a1[i1];
					i++;
					i1++;
				} else {// a2 ok
					result[i] = a2[i2];
					i++;
					i2++;
				}
			}
		}
		return result;
	}

	public static int[] mergeSort(int a[], int L, int R) {
		// THDB DKD
		if (L > R)
			return new int[0];
		if (L == R) {
			int[] singleElement = { a[L] };
			return singleElement;
		}
		// Chia ra
		System.out.println("Chia: " + L + " - " + R);
		int k = (L + R) / 2;
		int[] a1 = mergeSort(a, L, k);
		int[] a2 = mergeSort(a, k + 1, R);
		// Tron vao: a1, a2 la cac mang da duoc sap xep
		int[] result = merge(a1, a2);
		return result;
	}

	public static void quickSort(int[] a, int L, int R) {
		// dieu kien dung
		if (L >= R)
			return;
		// B1. Chon khoa
		int key = a[(L + R) / 2];
		// B2. Phan bo mang theo khoa
		int k = partition(a, L, R, key);
		System.out.println("L=" + L + " R=" + R + " key = " + key + " k = " + k);
		System.out.println(Arrays.toString(Arrays.copyOfRange(a, L, R + 1)));
		System.out.println("============================");
		// B3. Chia doi mang => Lap lai
		quickSort(a, L, k - 1);
		quickSort(a, k, R);
	}

	public static int partition(int[] a, int L, int R, int key) {
		int iL = L;
		int iR = R;
		while (iL <= iR) {
			// Voi iL, di tim phan tu >= key de doi cho
			while (a[iL] < key)
				iL++;
			// Voi iR, di tim phan tu <= key de doi cho
			while (a[iR] > key)
				iR--;
			// doi cho 2 phan tu dang ung khong dung vi tri
			if (iL <= iR) {
				int temp = a[iL];
				a[iL] = a[iR];
				a[iR] = temp;
				iL++;
				iR--;
			}
		}

		return iL;
	}

	public static void main(String[] args) {
		int[] ar2 = { 1, 2, 1, 2, 1, 3, 2 };
		int[] ar3 = { 5, 3, 2, 7, 8, 1, 2 };
		int[] ar4 = { 1, 2, 3, 4, 5, 8, 7 };

//		bubbleSort(ar2);
//		selectionSort(ar3);
//		insertSort(ar4);
		System.out.println(Arrays.toString(ar3));
		System.out.println("Start");
		quickSort(ar3, 0, ar3.length - 1);
		System.out.println("End");
		System.out.println(Arrays.toString(ar3));
	}
}
