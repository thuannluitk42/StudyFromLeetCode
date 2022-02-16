package Array;

public class RichestCustomerWealth {

	public int maximumWealth(int[][] accounts) {
		int numberOfCustomer = accounts.length;
		int numberOfBank = accounts[0].length;
		int max = 0;

		for (int i = 0; i < numberOfCustomer; i++) {
			int assetOneCustomer = 0;
			for (int j = 0; j < numberOfBank; j++) {
				assetOneCustomer += accounts[i][j];
			}
			if (assetOneCustomer > max) {
				max = assetOneCustomer; 
			}
		}
		return max;
	}

}
