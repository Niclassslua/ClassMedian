package uebung01;

import static pr.MakeItSimple.println;
import static pr.MakeItSimple.readInt;

//Ohne boolsche Operatoren && und || 
public class KlasseMedian {
	public static void main(String[] args) {
		println("Gebe eine ganze Zahl ein (a): ");
		int a = readInt();

		println("Gebe eine ganze Zahl ein (b): ");
		int b = readInt();

		println("Gebe eine ganze Zahl ein (c): ");
		int c = readInt();

		println(a + ", " + b + ", " + c);

		int median;

		if (a <= b) { // Hierdurch kann noch keine aussage getroffen werden, da wir nicht wissen wo c
						// liegt.
			if (b <= c) { // Durch transitivität gilt, dass b der Median ist.
				median = b;
			} else if (a <= c) { // Es gilt (b > c). Hierdurch kann noch keine aussage getroffen werden. a oder c
									// könnten Median sein.
				median = c;
			} else { // Es gilt (a < b) und (c < b) und (c < a).
				median = a;
			}
		} else { // Es gilt (a > b). Hierdurch kann noch keine aussage getroffen werden, da wir
					// nicht wissen wo c liegt.
			if (b >= c) { // Durch transitivität gilt, dass b der Median ist.
				median = b;
			} else if (a >= c) { // Es gilt (b < c). Hierdurch kann noch keine aussage getroffen werden. a oder c
									// könnten Median sein.
				median = c;
			} else { // Es gilt (b < a) und (b < c) und (a < c).
				median = a;
			}
		}

		println("Der Median hat den Wert " + median);
	}
}

// Mit boolschen Operatoren && und || 
/*
 * public class KlasseMedian { public static void main(String[] args) {
 * println("Gebe eine ganze Zahl ein (a): "); int a = readInt();
 * 
 * println("Gebe eine ganze Zahl ein (b): "); int b = readInt();
 * 
 * println("Gebe eine ganze Zahl ein (c): "); int c = readInt();
 * 
 * println(a + ", " + b + ", " + c);
 * 
 * int median;
 * 
 * if ((b <= a && a <= c) || (c <= a && a <= b)) { median = a; } else if ((a <=
 * b && b <= c) || (c <= b && b <= a)) { median = b; } else { median = c; }
 * 
 * println(median);
 * 
 * } }
 */