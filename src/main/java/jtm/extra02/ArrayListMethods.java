package jtm.extra02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
	List<Integer> myList = new ArrayList<Integer>();

	public List<Integer> checkArray(int comparator, int... numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			if (comparator > numbers[i]) {
				myList.add(numbers[i]);
			}
		}

		return myList;
	}

	public int sumResult() {
		int sum = 0;

		for (int i = 0; i < myList.size(); i++) {
			sum = sum + myList.get(i);
		}

		return sum;
	}
}
