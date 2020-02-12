package jtm.tasks.fundamentals;

public class MaxMultiple {

	/*
	 * TODO Given a Divisor and a Bound , Find the largest integer N , Such That
	 * , Conditions : N is divisible by divisor N is less than or equal to bound
	 * N is greater than 0.
	 * 
	 * The parameters (divisor, bound) passed to the function are only positve
	 * values . It's guaranteed that a divisor is Found .
	 * 
	 * maxMultiple (2,7) ==> return (6) (6) is divisible by (2) , (6) is less
	 * than or equal to bound (7) , and (6) is > 0 .
	 * 
	 * maxMultiple (10,50) ==> return (50) (50) is divisible by (10) , (50) is
	 * less than or equal to bound (50) , and (50) is > 0 .*
	 * 
	 * maxMultiple (37,200) ==> return (185) (185) is divisible by (37) , (185)
	 * is less than or equal to bound (200) , and (185) is > 0 .
	 * 
	 * 
	 */

	//

	public static int maxMultiple(int divisor, int bound) {
		// Your code here
		int max = 0;
		for (int i = 1; i <= bound; i++) { // 1, jo mums nulli nemaz nevajag
			if (i % divisor == 0) { // i, jo sakrit ar to ciparu nepieciesamo
				max = i;
			}
		}
		return max;
	}
	

	public static void main(String[] args) {
		
		System.out.println(maxMultiple(23, 199));
	}

}
