package Array;

public class RichestCustomerWealth {

	public int maximumWealth(int[][] accounts) {
		int numberOfCustomer = accounts.length;
		int numberOfBank = accounts[0].length;
		int[] sumOfAsset = new int[numberOfCustomer];

		for (int i = 0; i < numberOfCustomer; i++) {
			int assetOneCustomer = 0;
			for (int j = 0; j < numberOfBank; j++) {
				assetOneCustomer += accounts[i][j];
			}
			sumOfAsset[i] = assetOneCustomer;
		}
		int max = 0;
		for (int i = 0; i < sumOfAsset.length; i++) {
			if (sumOfAsset[i] > max) {
				max = sumOfAsset[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };

	}

}
