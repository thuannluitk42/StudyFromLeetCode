package Array;

public class CheckIfTwoStringArraysAreEquivalent {

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		for (String string : word1) {
			sb1.append(string);
		}
		for (String string : word2) {
			sb2.append(string);
		}
		return sb1.toString().equals(sb2.toString());
	}

	public static void main(String[] args) {
		CheckIfTwoStringArraysAreEquivalent ce = new CheckIfTwoStringArraysAreEquivalent();
		String[] word1 = { "ab", "c" };
		String[] word2 = { "a", "bc" };
		System.out.println(ce.arrayStringsAreEqual(word1, word2));
	}

}
