package jtm.tasks.fundamentals;

import java.util.Arrays;

public class EvenNumbers {

	// TODO
	/*
	 * Complete the function which takes two arguments and returns all numbers
	 * which are divisible by the given divisor. First argument is an array of
	 * numbers and the second is the divisor. Example: divisibleBy([1, 2, 3, 4,
	 * 5, 6], 2) == [2, 4, 6]
	 */

	/*
	 * MANI KOMENTARI ar for ciklu japiepilda array ar rezultatiem
	 * 
	 * japiedava array ar skaitliem, kuriem ies cauri un skatisies, vai dalas ar
	 * piedavato divisor
	 * 
	 * array[i]
	 * 
	 * vajag ta, lai X mainas.
	 * 
	 * vajag, lai divisibles[] garums butu vienads ar rezultata skaitlu skaitu
	 * 
	 */

	public static int[] divisibleBy(int[] numbers, int divider) {
		
		int[] divisibles = new int[numbers.length]; //pienemot sliktako gadijumu, ka visi skaitli dalas bez atlikuma
		int x = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0) {
				divisibles[x] = numbers[i]; //sis nozime, ka divisibles tiks piepildits ar numberiem, 
											//ja butu otrada seciba, butu vice versa
				
				x++;
				
			}
			
			
		}
		
		int result[] = new int[x];
		
		for (int i =0; i < result.length; i++){
			result[i] = divisibles[i];
		}

		return result;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(divisibleBy(new int[] { 1, 3, 10 }, 5)));
	}

}
