package numbers;

import java.io.*;
import java.util.*;

public class wordstonumbers {
	public static void main (String[] args) throws Exception {
		System.out.println("Type your sentence and the number of words on two seperate lines like so:");
		System.out.println("Lux is a good champion.");
		System.out.println(5);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String num = br.readLine();
		int nu = Integer.parseInt(num);
		String str1 = wordconvert(str, nu);
		System.out.println(str1);
	}
	public static int letterconvert(char x) {
		x = Character.toLowerCase(x);
		int a = (int)x;
		a-=96;
		return a;
	}
	public static String wordconvert (String x, int y) {
		StringTokenizer st = new StringTokenizer(x);
		String ret = "";
		String b;
		int z;
		for (int i = 0; i < y; i++) {
			b = st.nextToken();
			for (int j = 0; j < b.length(); j++) {
				char c = b.charAt(j);
				if (c == ',' || c == '\'' || c == '.' || c == '!' || c == '?' || c == '*' || c == '(' || c == ')') {
					ret+=c;
				}
				else {
					z = letterconvert(c);
					ret+=z;
					if (j != b.length()-1 && b.charAt(j+1)!= ',' && b.charAt(j+1) != '\'' && b.charAt(j+1)!= '.' 
							&& b.charAt(j+1)!= '!' &&  b.charAt(j+1) != '?' && b.charAt(j+1) != '*'
							&& b.charAt(j+1)!='(' && b.charAt(j+1) !=')')
						ret+= " ";
				}
			}
			ret += "    ";
		}
		return ret;
	}
}
