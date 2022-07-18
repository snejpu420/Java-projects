package String2;

/*String class represent character Strings. all strings literals in java programs are implemented as instance of this string class
 * String are contant, u cant change value if u create the string, string object is immutable
 * The class String includes methods for examining individual characters of the sequence
 * Case mapping is based on the Unicode
 * The Java language provides special support for the string concatenation operator ( + )
 * */
public class String2 {
	// DOUBLECHAR
	public String doubleChar(String str) {
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			str2 = str2 + str.charAt(i) + str.charAt(i);
		}
		return str2;
	}

	// COUNTHI
	public int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("hi")) {
				count++;
			}

		}
		return count;
	}

	// CATDOG
	public boolean catDog(String str) {
		int cat = 0;
		int dog = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("dog")) {
				dog++;

			} else if (str.substring(i, i + 3).equals("cat")) {
				cat++;
			}
	}
		if (cat == dog) {
			return true;
		}
		return false;
	}

	// COUNTCODE
	public int countCode(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) {

			if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
				count++;

			}

		}

		return count;
	}

	// ENDOTHER
	// if 1 of the string appears on the end of the other string then its true;
	public boolean endOther(String a, String b) {
		// b end a

		/*
		 * a=a.toLowerCase(); b=b.toLowerCase(); return a.endsWith(b) || b.endsWith(a);
		 */

		if (a.length() >= b.length()) { // Siema //ema
			return a.substring(a.length() - b.length()).equalsIgnoreCase(b);
		} else {
			return b.substring(b.length() - a.length()).equalsIgnoreCase(a);
		}

	}

	public boolean xyzThere(String str) {
		
		/*
		 * if (str.contains("xyz") && str.charAt(str.indexOf("xyz") - 1) != '.' ||
		 * str.charAt(str.lastIndexOf("xyz") - 1) != '.') {
		 * 
		 * 
		 * return true;}
		 * 
		 * 
		 * return false;
		 */

		for (int i = 0; i < str.length() - 2; i++) {
			if (i == 0 && str.substring(i, i + 3).equals("xyz")) {
				return true;
			} else if (str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.') {
				return true;
			}
		}
		return false;
	}

	// BOBTHERE

	public boolean bobThere(String str) {
		if (str.length() >= 3) {
			for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
				return true;
			}
			if (i + 2 >= str.length() - 1) {
				break;
			}

		}
	}
		return false;
	}

	// XYBALANCE
	public boolean xyBalance(String str) {
		boolean wasY = false;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x') {
				count++;
				wasY = false;
			}
			if (str.charAt(i) == 'y') {
				wasY = true;
			}
		}
		if (count > 0 && wasY || count == 0 && !wasY || str.length() == 1 && str.charAt(0) == 'y') {
			return true;
		}
		return false;
	}

	// MIXSTRING
	public String mixString(String a, String b) {
		int min = Math.min(a.length(), b.length());
		String str2 = "";
		for (int i = 0; i < min; i++) {
			str2 = str2 + a.charAt(i) + b.charAt(i);
		}
		if (a.length() > b.length()) {
			return str2 + a.substring(b.length());
		} else if (a.length() < b.length()) {
			return str2 + b.substring(a.length());
		} else
		return str2;
	}

	// REPEATEND

	public String repeatEnd(String str, int n) {
		String str2 = "";
		for (int i = 0; i < n; i++) {
			str2 += str.substring(str.length() - n);
		}
		return str2;
	}

	// REPEAFRONT
	public String repeatFront(String str, int n) {
		String str2 = "";
		for (int i = 0; i < n; i++) {
			str2 += str.substring(0, n - i);
		}
		return str2;
	}

	// REPEATSEPARATOR

	public String repeatSeparator(String word, String sep, int count) {
		String str2 = "";
		for (int i = 0; i < count; i++) {
			if (i + 1 == count) {
				str2 += word;
			} else {
				str2 += word + sep;
			}
		}
		return str2;
	}

	public boolean prefixAgain(String str, int n) {
		String str2 = str.substring(0, n);
		return str.substring(n).contains(str2);
	}

	// XYZMIDDLE
	public boolean xyzMiddle(String str) { // 3 cases if number of chars is odd then Y appears exactly on the middle if
											// i divide str length by 2.The next 2 cases is when number of chars is
											// even, then y can exist
											// 1 more on the right or more on the left side
		if (str.length() >= 3) {
			// IF ODD
		if (str.length() % 2 == 1 && str.charAt(str.length() / 2) == 'y' && str.charAt(str.length() / 2 - 1) == 'x'
				&& str.charAt(str.length() / 2 + 1) == 'z') {
			return true;
			// IF EVEN BUT Y IS MORE ON THE LEFT
		} else if (str.length() % 2 == 0 && (str.charAt(str.length() / 2 - 1) == 'y'
				&& str.charAt(str.length() / 2 - 2) == 'x' && str.charAt(str.length() / 2) == 'z')) {
			return true;
			// IF EVEN BUT Y IS MORE ON THE RIGHT
		} else if (str.length() % 2 == 0 && (str.charAt(str.length() / 2) == 'y'
				&& str.charAt(str.length() / 2 - 1) == 'x' && str.charAt(str.length() / 2 + 1) == 'z')) {
			return true;
		}
	}
		return false;
	}

	// GETSANDWICH //getSandwich("breadbreadbreadbread") → "breadbread" fail test
	public String getSandwich(String str) {
		boolean wasBread = false;
		String str2 = "";
		for (int i = 0; i < str.length() - 4; i++) {
			if (str.substring(i, i + 5).equals("bread") && wasBread && str2.length() > 0)
				return str2;
			if (str.substring(i, i + 5).equals("bread")) {
				wasBread = true;
				i += 4;
				continue;
				}
			if (wasBread) {
				str2 += str.charAt(i);
			}

		}
		return str2;
	}

	// SAMESTARCHAR
	public boolean sameStarChar(String str) {
		boolean star = true;
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == '*' && str.charAt(i - 1) == str.charAt(i + 1)) {
				star = true;
			} else if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
				star = false;
		}

		return star;
	}

	// ONETWO
	public String oneTwo(String str) {
		int reminder = str.length() % 3;
		int end = 0;
		String str2 = "";
		if (reminder == 0) {
			end = str.length();
		} else if (reminder != 0) {
			end = str.length() - reminder;
		}

		for (int i = 0; i < end - 1; i += 3) {
			str2 = str2 + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
		}


			return str2;

	}

	// ZIPZAP
	public String zipZap(String str) {
		String str2 = "";
		if (str.length() >= 3) {
			for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {

				str2 += "zp";
				i += 2;

			} else {
				str2 += str.charAt(i);
			}

		}
	} else {
		return str;
	}

		return str2;
	}

	// STAROUT

	public String starOut(String str) {

		String str2 = "";
		
		for (int i = 0; i < str.length(); i++) {
			if(i < str.length() -1 ) {
			if (str.charAt(i + 1) == '*') {
				continue;
			} else if ( str.charAt(i) == '*' && str.charAt(i + 1) != '*') {
				i += 2;
			}
			}
			str2 += str.charAt(i);
		}
		return str2;
	}

	// PLUSOUT
	public String plusOut(String str, String word) {
		String str2 = "";
		for (int i = 0; i < str.length() - word.length(); i++) {
			if (str.substring(i, word.length() + i).equals(word)) {
				str2 += word;
				i += word.length();
			} else {
				str2 += "+";
			}
		}
		return str2;
	}

	// wordEnds //2
	public String wordEnds(String str, String word) {
		String str2 = "";		//6
		for (int i = 0; i <= str.length() - word.length(); i++) {


			

		}
		return str2;
	}

}
