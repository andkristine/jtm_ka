package jtm.tasks.fundamentals;

public class PhoneNumber {

	/*
	 * TODO
	 * 
	 * Write a function that accepts an array of 10 integers (between 0 and 9),
	 * that returns a string of those numbers in the form of a phone number.
	 * 
	 * Example: createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) //
	 * => returns "(123) 456-7890"
	 * 
	 * The returned format must be correct in order to complete this challenge.
	 * Don't forget the space after the closing parentheses!
	 */

	public static String createPhoneNumber(int[] numbers) {

		String str = "";
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				str = str + "(";
			}
			if (i == 3) {
				str = str + ") ";
			}
			if (i==6){
				str = str + "-";
			}
			str = str + numbers[i];
		}

		return str;
	}
	
	public static void main (String[] args){
		createPhoneNumber(new int[] {1, 3, 4, 5, 7, 8, 9 , 0,3 ,5});
		System.out.println(createPhoneNumber(new int[] {1, 3, 4, 5, 7, 8, 9 , 0,3 ,5}));
	}
	
	
}
