package Logic2;

public class Logic2 {
	// MAKEBRICKS
	public boolean makeBricks(int small, int big, int goal) {
		if ((small + 5 * big) >= goal
				&& goal % 5 <= small) { /*
										 * our remainder of mod(5) need to be less than small value otherwise its
										 * impossible to make a row of bricks
										 */
			return true;
		}
		return false;
	}

	// LONESUM
	public int loneSum(int a, int b, int c) { // 3,2,3 -> 2
		int sum = 0;
		if (a != b && a != c) {
			sum += a;
		}
		if (b != c && b != a) {
			sum += b;
		}
		if (c != a && c != b) {
			sum += c;
		}
		return sum;
	}

	// LUCKYSUM
	public int luckySum(int a, int b, int c) {
		if (a == 13) { // return 0 if a == 13 so everything on the right dont count and int a dont
						// count also
			return 0;
		} else if (b == 13) {
			return a;
		} else if (c == 13) {
			return a + b;
		}
		return a + b + c; // return a+b+c if each of the values are other than 13
	}

	// NOTEENSUM
	public int noTeenSum(int a, int b, int c) {
		// return sum of 3 numbers
		int sum = a + b + c;
		// if one of the values is teen thats mean in range 13..19 inclusive then this
		// value count as 0
		if (a >= 13 && a <= 19 && a != 15 && a != 16) {
			sum -= a;
		}
		if (b >= 13 && b <= 19 && b != 15 && b != 16) {
			sum -= b;
		}
		if (c >= 13 && c <= 19 && c != 15 && c != 16) {
			sum -= c;
		}
		return sum;
		// expect 15 and 16 -they are not teen values
	}

	// ROUNDSUM
	public int roundSum(int a, int b, int c) {
		int aReminder = a % 10;
		int bReminder = b % 10;
		int cReminder = c % 10;
		if (aReminder >= 5) {
			a += (10 - aReminder);
		} else {
			a -= aReminder;
		}
		if (bReminder >= 5) {
			b += (10 - bReminder);
		} else {
			b -= bReminder;
		}
		if (cReminder >= 5) {
			c += (10 - cReminder);
		} else {
			c -= cReminder;
		}
		int sum = a + b + c;
		return sum;
	}

	// CLOSEFAR
	// return true if one of b or c is "close" -> max diffrence is 1 from a;
	// return false if one of b or c is "far" -> diffrent beetween ab or ac is 2 or
	// more than 2;
	public boolean closeFar(int a, int b, int c) {
		int ab = Math.abs(a - b);
		int bc = Math.abs(c - b);
		int ac = Math.abs(a - c);

		return ab <= 1 && bc >= 2 && ac >= 2 || ac <= 1 && bc >= 2 && ab >= 2;
	}

	// BLACKJACK
	public int blackJack(int a, int b) {
		int subA = 21 - a;
		int subB = 21 - b;

		if (subA >= 0 && subB >= 0) {
			if (subA < subB) {
				return a;
			} else {
				return b;
			}
		} else if (subA >= 0) {
			return a;
		} else if (subB >= 0) {
			return b;
		} else
			return 0;
	}
	
	
	//EVENLYSPACED
	public boolean evenlySpaced(int a, int b, int c) {
		//a b c - s m l
		//a b c - l s m
		//a b c - m 
		int ab = Math.abs(a-b);
		int bc = Math.abs(c-b);
		int ac = Math.abs(a-c);
		// a-b = b-c / b-c = c-a / c-a = a-b
		if (ab == bc && ac == ab + bc || bc == ac && ab == bc + ac || ac == ab && bc == ab + ac) {
			return true;
		}
		return false;

	}

	// MAKECHOCOLATE //not working yet
	// s=1kg b=5kg
	// idk

}

