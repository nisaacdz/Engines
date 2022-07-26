package packOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Laboratory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(Collections.nCopies(10, 0));
		
		for(int x: list) {
			++x;
		}
		
		System.out.println(list);
	}

}
