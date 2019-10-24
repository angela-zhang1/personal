import java.io.*;
import java.util.*;
// FLAME is a little shipping game. It's fun if you want to see if your couples will be canon according to FLAME.
public class FLAME {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String y = br.readLine();
		x = x.toLowerCase();
		y = y.toLowerCase();
		int i = 0; int j = 0;
		while (i < x.length()){
			j=0;
			while (j < y.length()) {
				if (x.charAt(i) == y.charAt(j)) {
					x = x.substring(0, i) + x.substring(i+1,x.length());
					y = y.substring(0, j) + y.substring(j+1,y.length());
					if (i!=0)
					i--;
					if (j!=0)
					j--;
				}
				j++;
			}
			i++;
		}
		if (x.length() > 0)
		System.out.println(x);
		if (y.length() > 0)
		System.out.println(y);
		System.out.println();
		int z = x.length() + y.length();
		System.out.println(z);
		if (z%5 == 0) {
			System.out.println("E: Enemies");
		}
		if (z%5 == 1) {
			System.out.println("F: Friends");
		}
		if (z%5 == 2) {
			System.out.println("L: Lovers");
		}
		if (z%5 == 3) {
			System.out.println("A: Attraction");
		}
		if (z%5 == 4) {
			System.out.println("M: Marriage");
		}
	}
}
