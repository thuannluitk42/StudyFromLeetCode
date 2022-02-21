package BinarySearch;

public class MyBinarySearch {
	// binary search dung vong lap
	public static int binarySearch(int[] a, int key) {
		int n = a.length;
		int iLeft = 0;
		int iRight = n - 1;
		while (iLeft <= iRight) {
			int iMid = (iLeft + iRight) / 2;
			System.out.println("[" + iLeft + "," + iRight + "] xet" + iMid);
			if (key == a[iMid]) {
				return iMid;
			} else if (key > a[iMid]) {
				iLeft = iMid + 1;
			} else {
				iRight = iMid - 1;
			}
		}
		return -1;
	}

	// binary search dung de quy
	public static int bSearch(int[] a, int key, int iLeft, int iRight) {
		if (iLeft > iRight) {
			return -1;
		}
		System.out.println("[" + iLeft + "," + iRight + "]");
		int iMid = (iLeft + iRight) / 2;
		if (key == a[iMid]) {
			return iMid;
		} else if (key > a[iMid]) {
			return bSearch(a, key, iMid + 1, iRight);
		} else { // key < a[iMid]
			return bSearch(a, key, iLeft, iMid - 1);
		}
	}

	public static int bSearch(int[] a, int key) {
		int n = a.length;
		return bSearch(a, key, 0, n - 1);
	}

	public static void main(String[] args) {
		int[] ar4 = { 1, 2, 3, 4, 5, 7, 8 };
		//System.out.println(binarySearch(ar4, 5));
		System.out.println(bSearch(ar4, 2));

	}
}
