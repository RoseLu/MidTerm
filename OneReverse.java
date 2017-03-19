package assignment;

import java.util.ArrayList;

public class OneReverse {

	public static void reverse(ArrayList<Integer> list) {

		for (int i = list.size() - 1; i >= 0; i--) {
			list.add(list.get(i));
			list.remove(list.get(i));
		}

	}

	//main method
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);

		System.out.println("Before reverse: " + list);

		for (int i = list.size() - 1; i >= 0; i--) {
			list.add(list.get(i));
			list.remove(list.get(i));
		}

		System.out.print("After reverse: " + list);

	}
}
