package curs11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysConversion {

	public static void main(String[] args) {
		Integer[] numbers = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
		Set<Integer> setNumbers = new HashSet<Integer>(Arrays.asList(numbers));
		
		for(Integer num : setNumbers) {
			System.out.print(num);
		}
		
		System.out.println();
		List<Integer> listNumbers = new ArrayList<Integer>(Arrays.asList(numbers));
		System.out.println("-----------------");
		for(Integer num : listNumbers) {
			System.out.print(num);
		}

	}

}
