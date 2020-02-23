package jtm.extra01;

public class Zodiac {

	/**
	 * Determine the sign of the zodiac, use day and month.
	 * 
	 * 1 January 2 February 3 March 4 April SHORT 5 May 6 June SHORT 7 July 8 August
	 * 9 September SHORT 10 October 11 November SHORT 12 December
	 * 
	 * @param day
	 * @param month
	 * @return zodiac
	 */
	public static String getZodiac(int day, int month) {
		String zodiac = null;

		if (month == 1) {

			if (day >= 1 && day <= 20) {
				zodiac = "Capricorn";
			} else {
				zodiac = "Aquarius";
			}
			
		} else if (month == 2) {
			
			if (day >= 1 && day <= 19) {
				zodiac = "Aquarius";
			} else {
				zodiac = "Pisces";
			}

		} else if (month == 3) {
			if (day >= 1 && day < 21) {
				zodiac = "Pisces";
			} else {
				zodiac = "Aries";
			}
		} else if (month == 4) {
			if (day >= 1 && day <= 20) {
				zodiac = "Aries";
			} else {
				zodiac = "Taurus";
			}
		} else if (month == 5) {
			if (day >= 1 && day <= 21) {
				zodiac = "Taurus";
			} else {
				zodiac = "Gemini";
			}
		} else if (month == 6) {
			if (day >= 1 && day <= 21) {
				zodiac = "Gemini";
			} else {
				zodiac = "Cancer";
			}
		} else if (month == 7) {
			if (day >= 1 && day < 23) {
				zodiac = "Cancer";
			} else {
				zodiac = "Leo";
			}
		} else if (month == 8) {
			if (day >= 1 && day < 23) {
				zodiac = "Leo";
			} else {
				zodiac = "Virgo";
			}
		} else if (month == 9) {
			if (day >= 1 && day <= 23) {
				zodiac = "Virgo";
			} else {
				zodiac = "Libra";
			}
		} else if (month == 10) {
			if (day >= 1 && day <= 23) {
				zodiac = "Libra";
			} else {
				zodiac = "Scorpio";
			}
		} else if (month == 11) {
			if (day >= 1 && day <= 22) {
				zodiac = "Scorpio";
			} else {
				zodiac = "Sagittarius";
			}
		} else if (month == 12) {
			if (day >= 1 && day < 22) {
				zodiac = "Sagittarius";
			} else {
				zodiac = "Capricorn";
			}

		} else {
			System.out.println("Nu such month");
		}

		return zodiac;
	}

	public static void main(String[] args) {
		// HINT: you can use main method to test your getZodiac method with
		// different parameters
		System.out.println(getZodiac(23, 10));
	}

}
