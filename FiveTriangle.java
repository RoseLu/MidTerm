package assignment;

import java.awt.List;
import java.util.ArrayList;

public class FiveTriangle {
	public List<Integer> getRow(int rowIndex) {                    //correct
		ArrayList<Integer> al = new ArrayList<Integer>();
		 
		if (rowIndex < 0)
			return al;
	 
		al.add(1);
		for (int i = 1; i <= rowIndex; i++) {
			for (int j = al.size() - 2; j >= 0; j--) {
				al.set(j + 1, al.get(j) + al.get(j + 1));
			}
			al.add(1);
		}
		return al;
	}

}
