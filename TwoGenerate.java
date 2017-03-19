package assignment;

import java.util.TreeSet;

public class TwoGenerate {
	public static String generateStrings(String s1, String s2) {
		TreeSet<String> ts = new TreeSet<String>();
		
		//corner case
		if (s1 == "" && s2 == "") {
			return "";
		} else {
			// joint the characters of strings and store them to TreeSet ts
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					ts.add(s1.charAt(i) + "" + s2.charAt(j));
				}
			}
		}

		// traverse the TreeSet and return the result with s and space
		String result = "";
		for (String s : ts) {
			result += s + " ";
		}

		return result;

	}

	public static void main(String[] args) {

		String s1 = "ABCD";
		String s2 = "EFGH";
		String s3 = "ACDC";
		String s4 = "ABBA";

		System.out.println(generateStrings(s1, s2));
		System.out.println(generateStrings(s3, s4));

	}
}