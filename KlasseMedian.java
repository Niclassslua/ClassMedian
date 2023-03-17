package ClassMedian;

// Without boolean operators (&& + ||)

public class ClassMedian {
	public static void main(String[] args) {
		System.out.println("Enter an integer (a): ");
		int a = ScannerObject.nextInt();

		System.out.println("Enter an integer (b): ");
		int b = ScannerObject.nextInt();

		System.out.println("Enter an integer (c): ");
		int c = ScannerObject.nextInt();

		System.out.println(a + ", " + b + ", " + c);

		int median;

		if (a <= b) { // This does not give any information, because we do not know where c is.
			if (b <= c) { // By transitivity (aka. Implication logic), b is said to be the median.
				median = b;
			} else if (a <= c) { // b > c is valid. Hereby no statement can be made yet. a or c could be median.
				median = c;
			} else { // It is true that a < b and c < b and c < a.
				median = a;
			}
		} else { // It is valid a > b. Hereby still no statement can be made, since we do not know where c lies.
			if (b >= c) {
				median = b;
			} else if (a >= c) { // b > c is valid. Hereby no statement can be made yet. a or c could be median.
				median = c;
			} else { // It is true that b < a and b < c and a < c.
				median = a;
			}
		}

		System.out.println("The median has the value " + median);
	}
}

// With boolean operators && + || 



public class KlasseMedian { 
	public static void main(String[] args) {
		System.out.println("Enter an integer (a): ");
		int a = ScannerObject.nextInt();

		System.out.println("Enter an integer (b): ");
		int b = ScannerObject.nextInt();

		System.out.println("Enter an integer (c): ");
		int c = ScannerObject.nextInt();

		System.out.println(a + ", " + b + ", " + c);

		int median;

		if ( (b <= a && a <= c) || (c <= a && a <= b) ) {
			median = a;
		} else if ( (a <= b && b <= c) || (c <= b && b <= a) ) {
			median = b;
		} else {
			median = c;
		}
		
			System.out.println("The median has the value " + median);
		
	} 
}
